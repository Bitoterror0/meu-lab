# Git básico

Git é uma ferramenta que guarda o histórico das mudanças nos seus arquivos. Com ele, você pode voltar a versões anteriores, comparar alterações e testar ideias sem perder o que já funciona.

## Conceitos principais

- **Repositório**: pasta acompanhada pelo Git, com todo o histórico.
- **Commit**: registro de um conjunto de mudanças, com uma mensagem explicando o que foi feito.
- **Branch**: linha de trabalho separada, útil para experimentar sem mexer na principal.
- **Remoto**: cópia do repositório em um servidor, como o GitHub.

## Comandos do dia a dia

```bash
git status                          # mostra o que mudou
git diff                            # exibe alterações ainda não preparadas
git add notas/arquivo.md            # prepara um arquivo para o commit
git diff --staged                   # mostra o que vai entrar no commit
git commit -m "Descreve a mudança"  # registra as alterações preparadas
git log --oneline                   # lista os commits de forma resumida
git pull                            # traz novidades do remoto
git push                            # envia seus commits para o remoto
```

## Dicas

- Rode `git status` com frequência; ele costuma indicar o próximo passo.
- Faça commits pequenos, cada um com uma ideia só.
- Escreva mensagens claras, no presente: "Adiciona nota sobre listas".
- Antes de enviar, revise com `git diff --staged`.
- Em caso de dúvida sobre um comando, consulte `git help <comando>`.
