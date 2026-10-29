# Padrão Comportamental: Chain of Responsibility (Helpdesk de TI)

## Descrição do Projeto
Este projeto implementa o padrão comportamental **Chain of Responsibility** para gerenciar um fluxo de atendimento em uma central de suporte técnico de TI (Helpdesk).

Cada nível de atendimento possui autonomia sobre determinados tipos de chamados. Caso o nível atual não tenha permissão ou capacidade técnica para atender o chamado recebido, ele o repassa automaticamente para o seu superior imediato na cadeia.

## Estrutura da Cadeia de Atendimento
1. **Atendente Nível 1** (`AtendenteNivel1`): Resolve solicitações básicas de suporte, como redefinição de credenciais (`TipoChamadoResetSenha`).
2. **Atendente Nível 2** (`AtendenteNivel2`): Atende problemas de conectividade e acesso corporativo (`TipoChamadoConfiguracaoVPN`).
3. **Atendente Especialista** (`AtendenteEspecialista`): Trata incidentes críticos de infraestrutura (`TipoChamadoFalhaServidor`).
4. **Gerente de TI** (`AtendenteGerente`): Responsável pela gestão de riscos severos e segurança da informação (`TipoChamadoVazamentoDados`).
5. **Sem Atendimento**: Chamados que fogem da esteira de atendimento de TI, como danos físicos em peças (`TipoChamadoHardwareDanificado`), percorrem toda a cadeia sem resolução e retornam a resposta padrão `"Sem atendimento"`.

## Execução dos Testes
Para rodar a suíte de testes unitários com JUnit 5:

```bash
mvn test
