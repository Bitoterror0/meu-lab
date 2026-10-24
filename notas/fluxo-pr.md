# Fluxo de Pull Request

Roteiro para propor uma mudança pequena usando uma branch e um pull request (PR), mantendo a `main` estável.

**1. Atualize a main**

```bash
git switch main
git pull --ff-only
```

**2. Crie a branch da mudança**

```bash
git switch -c estudo/minha-nota
```

**3. Edite o arquivo de verdade**

Abra `notas/minha-nota.md`, escreva o conteúdo e salve. Depois confira o que mudou:

```bash
git status
git diff
```

**4. Prepare e registre a mudança**

```bash
git add notas/minha-nota.md
git commit -m "Adiciona minha nota de estudo"
```

**5. Envie a branch**

```bash
git push -u origin estudo/minha-nota
```

**6. Abra o PR**

No GitHub, crie um PR de `estudo/minha-nota` para `main`. No título e na descrição, explique o que mudou e por quê.

## Revisão antes do merge

- Leia a aba de arquivos alterados linha por linha.
- Confirme que o PR faz só o que promete.
- Precisa ajustar? Edite, faça um novo commit e rode `git push` na mesma branch; o PR é atualizado automaticamente.
- Faça o merge apenas quando a revisão estiver concluída.

Depois do merge, volte e atualize a `main`:

```bash
git switch main
git pull --ff-only
```
