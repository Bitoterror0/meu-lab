# Exercícios de Lógica de Programação

Esta lista contém cinco exercícios práticos para treinar estruturas condicionais, laços de repetição e manipulação de texto. Para cada enunciado, são apresentados os valores de entrada e os resultados esperados de referência, incluindo casos de borda para orientar a implementação.

---

## 1. Par ou Ímpar

### Enunciado
Receba um número inteiro `n` e retorne o texto `par` quando `n` for divisível por 2 (resto da divisão igual a 0) ou o texto `ímpar` quando o resto da divisão por 2 for diferente de 0.

### Entradas e resultados esperados
| Entrada (`n`) | Resultado esperado | Observação |
| :--- | :--- | :--- |
| `4` | `par` | Inteiro positivo par |
| `7` | `ímpar` | Inteiro positivo ímpar |
| `0` | `par` | Caso de borda: zero é número par |
| `-2` | `par` | Caso de borda: inteiro negativo par |
| `-1` | `ímpar` | Caso de borda: inteiro negativo ímpar |

---

## 2. Maior de Três

### Enunciado
Receba três números (`a`, `b` e `c`) e retorne o maior valor entre eles. Caso dois ou três números empatem com o maior valor, retorne esse próprio valor máximo.

### Entradas e resultados esperados
| Entrada (`a`, `b`, `c`) | Resultado esperado | Observação |
| :--- | :--- | :--- |
| `a = 10, b = 25, c = 15` | `25` | Três valores positivos distintos |
| `a = 8, b = 8, c = 3` | `8` | Caso de borda: empate entre os dois maiores |
| `a = 5, b = 5, c = 5` | `5` | Caso de borda: todos os três números iguais |
| `a = -10, b = -3, c = -25` | `-3` | Caso de borda: todos os números negativos |
| `a = 0, b = -4, c = 0` | `0` | Caso de borda: empate no zero com terceiro valor negativo |

---

## 3. FizzBuzz

### Enunciado
Receba um número inteiro `n` e produza uma lista de textos correspondente à sequência de `1` até `n` (inclusive), seguindo estas regras para cada número da sequência:
- Se o número for divisível por 3 e por 5 ao mesmo tempo (múltiplo de 15), use `FizzBuzz`.
- Caso contrário, se for divisível apenas por 3, use `Fizz`.
- Caso contrário, se for divisível apenas por 5, use `Buzz`.
- Caso não seja múltiplo de 3 nem de 5, use o próprio número convertido para texto.
- Se `n` for menor que `1`, retorne uma lista vazia `[]`.

### Entradas e resultados esperados
| Entrada (`n`) | Resultado esperado | Observação |
| :--- | :--- | :--- |
| `1` | `['1']` | Caso de borda: menor limite positivo válido |
| `3` | `['1', '2', 'Fizz']` | Caso de borda: primeiro múltiplo de 3 |
| `5` | `['1', '2', 'Fizz', '4', 'Buzz']` | Inclusão do primeiro múltiplo de 5 |
| `15` | `['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz', 'Buzz', '11', 'Fizz', '13', '14', 'FizzBuzz']` | Caso de borda: primeiro múltiplo comum de 3 e 5 |
| `0` | `[]` | Caso de borda: valor abaixo de 1 retorna sequência vazia |
| `-5` | `[]` | Caso de borda: número negativo retorna sequência vazia |

---

## 4. Tabuada

### Enunciado
Receba um número inteiro `n` e gere as 10 linhas da sua tabuada de multiplicação, com o multiplicador variando de `1` até `10` em ordem crescente, seguindo exatamente o padrão `n x i = resultado`.

### Entradas e resultados esperados

- **Entrada:** `n = 5` (inteiro positivo comum)
  - **Resultado esperado:**
    - `5 x 1 = 5`
    - `5 x 2 = 10`
    - `5 x 3 = 15`
    - `5 x 4 = 20`
    - `5 x 5 = 25`
    - `5 x 6 = 30`
    - `5 x 7 = 35`
    - `5 x 8 = 40`
    - `5 x 9 = 45`
    - `5 x 10 = 50`

- **Entrada:** `n = 1` (caso de borda: elemento neutro da multiplicação)
  - **Resultado esperado:**
    - `1 x 1 = 1`
    - `1 x 2 = 2`
    - `1 x 3 = 3`
    - `1 x 4 = 4`
    - `1 x 5 = 5`
    - `1 x 6 = 6`
    - `1 x 7 = 7`
    - `1 x 8 = 8`
    - `1 x 9 = 9`
    - `1 x 10 = 10`

- **Entrada:** `n = 0` (caso de borda: multiplicação por zero)
  - **Resultado esperado:**
    - `0 x 1 = 0`
    - `0 x 2 = 0`
    - `0 x 3 = 0`
    - `0 x 4 = 0`
    - `0 x 5 = 0`
    - `0 x 6 = 0`
    - `0 x 7 = 0`
    - `0 x 8 = 0`
    - `0 x 9 = 0`
    - `0 x 10 = 0`

- **Entrada:** `n = -3` (caso de borda: inteiro negativo)
  - **Resultado esperado:**
    - `-3 x 1 = -3`
    - `-3 x 2 = -6`
    - `-3 x 3 = -9`
    - `-3 x 4 = -12`
    - `-3 x 5 = -15`
    - `-3 x 6 = -18`
    - `-3 x 7 = -21`
    - `-3 x 8 = -24`
    - `-3 x 9 = -27`
    - `-3 x 10 = -30`

---

## 5. Inversão de Texto ASCII

### Enunciado
Receba uma sequência de caracteres ASCII `texto` e retorne uma nova sequência com os caracteres na ordem inversa (do último para o primeiro), preservando espaços em branco, dígitos, sinais de pontuação e a diferença entre letras maiúsculas e minúsculas.

### Entradas e resultados esperados
| Entrada (`texto`) | Resultado esperado | Observação |
| :--- | :--- | :--- |
| `'logica'` | `'acigol'` | Palavra simples em letras minúsculas |
| `'Git 123!'` | `'!321 tiG'` | Texto com maiúscula, espaço, números e pontuação |
| `''` | `''` | Caso de borda: texto vazio retorna texto vazio |
| `'A'` | `'A'` | Caso de borda: texto com um único caractere |
| `'arara'` | `'arara'` | Caso de borda: palíndromo permanece igual após inversão |
| `'  ab '` | `' ba  '` | Caso de borda: espaços nas extremidades mudam de lado |
