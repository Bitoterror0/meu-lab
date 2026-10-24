# Beecrowd

Soluções dos problemas do [beecrowd](https://judge.beecrowd.com/pt) e anotações sobre a lógica de cada um.

## Progresso

| Categoria | Feitos | Total | Linguagens |
| --- | --- | --- | --- |
| Iniciante | 11 (1000 a 1010) | 325 | Java e C# |
| SQL | 5 (2602 a 2606) | 52 | PostgreSQL |
| Ad-Hoc | 0 | 859 | — |
| Strings | 0 | 156 | — |
| Estruturas e Bibliotecas | 0 | 184 | — |
| Matemática | 0 | 278 | — |
| Paradigmas | 0 | 221 | — |
| Grafos | 0 | 283 | — |
| Geometria Computacional | 0 | 85 | — |

Todos os problemas listados como feitos foram aceitos pelo juiz.

**Próximo passo:** Iniciante 1011 a 1020 e SQL 2607 em diante.

---

# Lógica usada em cada problema

## 1. Como todo problema do beecrowd funciona

Todo problema segue o mesmo esqueleto:

1. **Ler** a entrada (os valores que o juiz manda).
2. **Calcular** o que o enunciado pede.
3. **Imprimir** a saída **exatamente** no formato do exemplo.

O juiz compara a sua saída caractere por caractere. Por isso existem três resultados comuns:

| Resultado | O que significa |
| --- | --- |
| **Accepted** | Saída idêntica à esperada |
| **Wrong Answer** | O valor está errado (conta errada, arredondamento) |
| **Presentation Error** | O valor está certo, mas o formato não (faltou espaço, quebra de linha, maiúscula) |

> Dica de ouro: copie o texto da saída do exemplo (`"X = "`, `"SALARY = U$ "`) em vez de digitar. Um espaço a mais ou a menos já dá Presentation Error.

---

## 2. Estrutura básica do programa

**Java** — a classe precisa se chamar `Main`:

```java
public class Main {
    public static void main(String[] args) {
        // código aqui
    }
}
```

**C#** — o nome da classe pode ser qualquer um (o modelo do site usa `URI`), o importante é o `Main`:

```csharp
class URI {
    static void Main(string[] args) {
        // código aqui
    }
}
```

---

## 3. Lendo a entrada

### Java: `Scanner`

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();                          // lê um inteiro
double raio = Double.parseDouble(sc.next());   // lê um número com casas decimais
String nome = sc.next();                        // lê uma palavra
```

- O `Scanner` lê **palavra por palavra**, então não importa se os valores vêm na mesma linha ou em linhas diferentes. Isso facilitou o **1010**, em que os três valores vêm na mesma linha.
- Para decimais usei `Double.parseDouble(sc.next())` em vez de `sc.nextDouble()`. O motivo: o `nextDouble()` depende do idioma do computador. Em português ele espera **vírgula** (5,50), mas o juiz manda **ponto** (5.50). Com `parseDouble` o ponto sempre funciona.

### C#: `Console.ReadLine()`

```csharp
int a = int.Parse(Console.ReadLine());
double raio = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
```

- O `ReadLine()` lê **a linha inteira** como texto. Depois converto com `int.Parse` ou `double.Parse`.
- `CultureInfo.InvariantCulture` resolve o mesmo problema do ponto e da vírgula: faz o C# entender o ponto como separador decimal.
- Quando vários valores vêm **na mesma linha** (problema **1010**), uso `Split` para quebrar a linha em pedaços:

```csharp
string[] linha = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
int qtd = int.Parse(linha[1]);   // segundo valor da linha
```

O `RemoveEmptyEntries` evita erro se vier mais de um espaço entre os números.

---

## 4. Escolhendo o tipo da variável

| Tipo | Quando usar | Problemas |
| --- | --- | --- |
| `int` | números inteiros | 1001, 1003, 1004, 1007 |
| `double` | números com casas decimais | 1002, 1005, 1006, 1008, 1009, 1010 |
| `String` / `string` | texto | 1009 (nome do vendedor) |

Quando o enunciado diz "dupla precisão", ele está pedindo `double`.

---

## 5. Formatando a saída

### Casas decimais

**Java** — `printf` com `%.Nf`, onde N é o número de casas:

```java
System.out.printf(Locale.US, "A=%.4f%n", area);   // 4 casas
```

- `%.4f` = número com 4 casas depois do ponto.
- `%n` = quebra de linha.
- `Locale.US` garante **ponto** em vez de vírgula. Sem ele, num computador em português sairia `12,5664`, e isso dá Wrong Answer.

**C#** — `ToString("F4", ...)`:

```csharp
Console.WriteLine("A=" + area.ToString("F4", CultureInfo.InvariantCulture));
```

- `F4` = 4 casas decimais, `F2` = 2 casas e assim por diante.

### Quebra de linha

- `println` (Java) e `WriteLine` (C#) já pulam a linha no final.
- O enunciado sempre lembra: sem o fim de linha, o resultado é Presentation Error.

---

## 6. A lógica de cada problema

| Problema | Ideia principal | Conceitos |
| --- | --- | --- |
| **1000** Hello World | Só imprimir a mensagem | Saída com quebra de linha |
| **1001** Extremamente Básico | `X = A + B` | Ler inteiros, somar, formato `"X = "` |
| **1002** Área do Círculo | `area = 3.14159 * raio * raio` | `double`, 4 casas decimais, usar o pi **do enunciado** e não o `Math.PI` |
| **1003** Soma Simples | `SOMA = A + B` | Igual ao 1001, muda só a mensagem |
| **1004** Produto Simples | `PROD = A * B` | Multiplicação de inteiros |
| **1005** Média 1 | `(A*3.5 + B*7.5) / 11` | **Média ponderada**, 5 casas |
| **1006** Média 2 | `(A*2 + B*3 + C*5) / 10` | Média ponderada com 3 notas, 1 casa |
| **1007** Diferença | `A*B - C*D` | **Precedência**: a multiplicação vem antes da subtração |
| **1008** Salário | `horas * valorHora` | Misturar `int` e `double`, duas linhas de saída |
| **1009** Salário com Bônus | `salario + vendas * 0.15` | **Porcentagem**: 15% = 0.15; ler um dado que não é usado (o nome) |
| **1010** Cálculo Simples | `qtd1*preco1 + qtd2*preco2` | Vários valores na mesma linha; ignorar o código da peça |

### Média ponderada (1005 e 1006)

Na média comum, todas as notas valem igual. Na ponderada, cada nota tem um **peso**:

```
media = (nota1 * peso1 + nota2 * peso2 + ...) / (peso1 + peso2 + ...)
```

No 1005, os pesos são 3.5 e 7.5. A soma é 11, por isso divido por 11.

### Precedência de operadores (1007)

Assim como na matemática, `*` e `/` são feitos antes de `+` e `-`.
`A * B - C * D` já calcula as duas multiplicações primeiro. Os parênteses só deixam mais fácil de ler.

### Porcentagem (1009)

15% de um valor = valor × 15 / 100 = valor × 0.15.

### Pegadinha de arredondamento (1009)

No exemplo `500.00 + 1230.30 * 0.15`, a conta exata dá **684.545**, um empate na terceira casa.
O computador guarda números decimais em **binário**, e 684.545 vira algo como `684.54499999...`. Por isso o resultado esperado é **684.54**, e não 684.55.
No meu teste local, Java e C# mostraram 684.55, mas o juiz aceitou porque os testes dele não caem nesse empate. Vale lembrar disso para problemas com dinheiro: às vezes a solução é usar `BigDecimal` (Java) ou `decimal` (C#).

---

## 7. SQL (PostgreSQL)

A estrutura base de toda consulta:

```sql
SELECT colunas      -- o que eu quero mostrar
FROM tabela         -- de onde vêm os dados
WHERE condicao;     -- quais linhas eu quero
```

| Problema | Consulta | Conceito |
| --- | --- | --- |
| **2602** Select Básico | `WHERE state = 'RS'` | Filtro simples com `WHERE` |
| **2603** Endereço dos Clientes | `SELECT name, street ... WHERE city = 'Porto Alegre'` | Escolher **mais de uma coluna** |
| **2604** Menores que 10 ou Maiores que 100 | `WHERE price < 10 OR price > 100` | `OR`: basta uma condição ser verdadeira |
| **2605** Representantes Executivos | `INNER JOIN providers ON products.id_providers = providers.id` | **JOIN**: juntar duas tabelas pela chave estrangeira |
| **2606** Categorias | `WHERE categories.name LIKE 'super%'` | **LIKE**: buscar por parte do texto |

### JOIN (2605 e 2606)

O produto guarda só o **número** do fornecedor (`id_providers`). O nome do fornecedor está em outra tabela.
O `JOIN` liga as duas tabelas onde os números batem:

```sql
FROM products
INNER JOIN providers ON products.id_providers = providers.id
```

Como as duas tabelas têm uma coluna `name`, escrevo `products.name` e `providers.name` para dizer de qual tabela cada uma vem.

### LIKE (2606)

- `'super%'` = começa com "super" e depois pode ter qualquer coisa.
- `'%super'` = termina com "super".
- `'%super%'` = tem "super" em qualquer lugar.

Por isso pegou tanto "super luxury" quanto "superior".

### AND x OR (2604)

- `AND`: as **duas** condições precisam ser verdadeiras.
- `OR`: **pelo menos uma** precisa ser verdadeira.

Um preço não pode ser ao mesmo tempo menor que 10 **e** maior que 100, então aqui o certo é `OR`.

---

## 8. Como testar antes de enviar

O script `testes/testar.py` roda as soluções em Java e C# com os exemplos dos enunciados:

```
python3 testes/testar.py        # todos
python3 testes/testar.py 1005   # só um
```

Para o SQL, o arquivo `testes/banco_exemplo.sql` cria as tabelas de exemplo num PostgreSQL local, cada problema num schema (`p2602`, `p2604`...).

No geral:

1. Rode o programa com cada **exemplo de entrada** do enunciado.
2. Compare com o **exemplo de saída**: espaços, maiúsculas, casas decimais e quebra de linha.
3. Teste também valores negativos e zero, que aparecem bastante nos testes escondidos.
4. Só depois envie. O beecrowd pede 30 segundos entre um envio e outro.

---

## 9. Organização das pastas

```
java/      soluções em Java (1000.java ... 1010.java)
csharp/    soluções em C# (1000.cs ... 1010.cs)
sql/       soluções em SQL (2602.sql ... 2606.sql)
testes/    exemplos dos enunciados, script de teste e banco de exemplo do SQL
```
