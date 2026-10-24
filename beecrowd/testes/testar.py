# Roda as solucoes em Java e C# com os exemplos do enunciado
# e mostra se a saida bateu com a esperada.
#
# Uso (dentro da pasta beecrowd):
#   python3 testes/testar.py          -> testa todos
#   python3 testes/testar.py 1005     -> testa so o 1005
#
# Precisa ter o javac/java e o mcs/mono (C#) instalados.

import json
import os
import shutil
import subprocess
import sys
import tempfile

pasta = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
casos = json.load(open(os.path.join(pasta, "testes", "casos.json")))
problemas = sys.argv[1:] or sorted(casos, key=int)


def preparar(linguagem, problema, tmp):
    # compila e devolve o comando para rodar o programa
    if linguagem == "java":
        shutil.copy(os.path.join(pasta, "java", problema + ".java"), os.path.join(tmp, "Main.java"))
        c = subprocess.run(["javac", "Main.java"], cwd=tmp, capture_output=True, text=True)
        return c, ["java", "-cp", tmp, "Main"]
    exe = os.path.join(tmp, "programa.exe")
    c = subprocess.run(["mcs", "-out:" + exe, os.path.join(pasta, "csharp", problema + ".cs")],
                       capture_output=True, text=True)
    return c, ["mono", exe]


for problema in problemas:
    resultado = []
    for linguagem in ("java", "csharp"):
        tmp = tempfile.mkdtemp()
        compilacao, comando = preparar(linguagem, problema, tmp)
        if compilacao.returncode != 0:
            resultado.append(linguagem + ": erro de compilacao")
            continue
        certo = True
        for entrada, esperado in casos[problema]:
            saida = subprocess.run(comando, input=entrada, capture_output=True, text=True).stdout
            if saida != esperado:
                certo = False
                resultado.append(f"{linguagem}: saiu {saida!r}, esperado {esperado!r}")
        if certo:
            resultado.append(linguagem + ": ok")
    print(problema, " | ".join(resultado))
