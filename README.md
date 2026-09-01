# SistemaCadastro[

Respostas
1. Qual a finalidade de uma branch?

Uma branch permite criar uma linha de desenvolvimento isolada do código principal, com ela é possível desenvolver uma nova funcionalidade, corrigir um bug ou testar uma ideia sem interferir no código que já está estável na main

2. Qual a diferença entre commit e merge?
Commit: é um histórico das alterações feitas nos arquivos em um determinado momento, dentro de uma única branch

Merge: é a ação de unir o histórico de duas branches diferentes, trazendo os commits de uma branch para outra

Diferença: Enquanto o commit registra mudanças, o merge integra mudanças que foram feitas em branches separadas

3. Por que é importante utilizar mensagens claras nos commits?

Mensagens claras facilitam o entendimento do histórico do projeto, permitindo que qualquer pessoa da equipe entenda rapidamente o que mudou e por quê, sem precisar analisar linha por linha o código. Isso agiliza revisões de código, facilita a localização de bugs e torna mais simples reverter uma alteração específica quando necessário

4. Por que o controle de versão é importante em equipes de desenvolvimento?

O controle de versão permite que várias pessoas trabalhem no mesmo projeto simultaneamente, sem sobrescrever o trabalho umas das outras, ele mantém um histórico completo de todas as alterações, possibilita reverter mudanças problemáticas, facilita a revisão de código antes do pull requests e permite testar novas funcionalidades em branches isoladas sem comprometer a versão estável do sistema

5. O que representa a versão 1.1.0 no contexto desta atividade?

1 (MAJOR): versão principal do projeto, sem mudanças que quebrem compatibilidade em relação à anterior

1 (MINOR): indica que uma nova funcionalidade foi adicionada de forma compatível com as versões anteriores (Opção "Deletar usuário")

0 (PATCH): nenhuma correção de bug foi aplicada nesta versão

6. Comandos Git para criação de tag via CLI

Além de criar a tag pela interface do GitHub, o mesmo resultado pode ser obtido via linha de comando:

bash
# Criar uma tag anotada (recomendada, guarda autor, data e mensagem)
git tag -a v1.1.0 -m "Versão 1.1.0 - Adiciona funcionalidade de deletar usuário"

# Enviar a tag criada para o repositório remoto (GitHub)
git push origin v1.1.0

# (Opcional) Enviar todas as tags locais de uma vez
git push origin --tags

# (Opcional) Listar as tags existentes no repositório
git tag

# (Opcional) Ver os detalhes de uma tag específica
git show v1.1.0
