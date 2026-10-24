# Markdown

Markdown é um jeito simples de formatar texto usando símbolos comuns. O GitHub exibe esses arquivos já formatados.

## Títulos

```markdown
# Título principal
## Seção
### Subseção
```

## Ênfase

```markdown
*itálico*, **negrito** e `código`
```

## Listas

```markdown
- item
- outro item

1. primeiro passo
2. segundo passo
```

## Links

Links relativos apontam para arquivos do próprio repositório e continuam funcionando em qualquer branch. Como este arquivo está na mesma pasta das outras notas, basta o nome do arquivo:

```markdown
[Veja as notas de Git básico](git-basico.md)
[Site do GitHub](https://github.com)
```

Na prática: [Git básico](git-basico.md).

## Blocos de código

Use três crases antes e depois do código, indicando a linguagem:

~~~markdown
```bash
git status
```
~~~

## Citações e tabelas

```markdown
> Uma citação.

| Comando    | Função          |
|------------|-----------------|
| git status | mostra mudanças |
```

## Dicas

- Deixe uma linha em branco entre parágrafos e blocos.
- Confira a prévia no GitHub antes de fazer o commit.
