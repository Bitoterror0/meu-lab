# Glossário de Git

Este glossário reúne 12 termos fundamentais do Git em ordem alfabética, com definições diretas para consulta durante os estudos.

## 1. Branch (Ramo)
Linha independente de desenvolvimento dentro de um repositório. Permite criar novas funcionalidades, testar ideias ou corrigir problemas de forma isolada, sem alterar a linha principal do projeto até que o trabalho esteja pronto para ser integrado.

## 2. Checkout
Operação utilizada para alternar entre branches existentes no repositório local ou para restaurar arquivos da pasta de trabalho para o estado registrado em um commit específico. Em versões recentes do Git, essa função também é dividida entre os comandos `git switch` (troca de branch) e `git restore` (restauração de arquivos).

## 3. Clone
Cópia local de um repositório existente. O clone comum inclui o histórico e referências remotas; opções de clone raso, parcial ou de branch única podem limitar o conteúdo obtido.

## 4. Commit
Registro de uma versão do projeto. Um commit contém a árvore de arquivos, autoria, datas e mensagem, além de zero ou mais commits pais. O primeiro commit não tem pai; um merge pode ter mais de um. Seu identificador é calculado a partir do conteúdo do objeto.

## 5. Diff
Comparação detalhada que exibe as diferenças linha a linha entre dois estados do código, como entre a pasta de trabalho e a área de preparação (`git diff`), entre a área de preparação e o último commit (`git diff --staged`), ou entre dois commits e branches diferentes.

## 6. Fork
Cópia independente de um repositório criada na conta de outro usuário dentro da plataforma de hospedagem. É muito usado para estudar um projeto ou desenvolver melhorias em um repositório próprio antes de enviar uma proposta ao projeto original.

## 7. HEAD
Ponteiro especial que indica qual é o commit ou a branch ativa no momento dentro do seu repositório local. Na maioria das vezes, o `HEAD` aponta para o último commit da branch em que você está trabalhando.

## 8. Merge (Mesclagem)
Processo de unir o histórico de alterações de uma branch dentro de outra. Quando uma funcionalidade fica pronta em uma branch separada, o merge incorpora essas mudanças na branch de destino.

## 9. Pull
Comando que busca as atualizações mais recentes de um repositório remoto e as integra na branch atual do repositório local. Equivale a executar a busca das novidades (`git fetch`) seguida da integração (`git merge` ou `git rebase`).

## 10. Pull Request (PR)
Proposta formal aberta na plataforma de hospedagem para que as alterações feitas em uma branch sejam revisadas, comentadas e mescladas em outra branch do repositório.

## 11. Push
Envio dos commits gravados no repositório local para atualizar a branch correspondente no repositório remoto, tornando as alterações disponíveis na plataforma de hospedagem.

## 12. Staging Area (Área de Preparação ou Index)
Camada intermediária entre a pasta de trabalho e o histórico do repositório. Nela ficam reunidas as alterações selecionadas com `git add` que farão parte do próximo commit, permitindo organizar mudanças em registros pequenos e objetivos.
