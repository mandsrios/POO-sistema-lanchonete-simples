## Visão Geral do Projeto
Este é um sistema simples de gerenciamento de lanchonete desenvolvido em Java, demonstrando conceitos de Programação Orientada a Objetos (POO). O projeto foi criado como exercício do bootcamp da DIO.

## Estrutura das Classes

### Classe `Produto`
- **Propósito**: Representa um produto da lanchonete com atributos básicos.
- **Atributos**:
  - `id` (int): Identificador único do produto
  - `nome` (String): Nome do produto
  - `valor` (double): Preço do produto
- **Métodos**: Construtores (com/sem parâmetros), getters/setters e `toString()` para exibição formatada.

### Classe `Servicos`
- **Propósito**: Contém a lógica de negócio para operações com produtos.
- **Métodos principais**:
  - `adicionarProduto(int id)`: Cria um novo produto solicitando nome e valor via console
  - `listarProdutos(ArrayList<Produto>)`: Exibe todos os produtos cadastrados
  - `deletarProduto(ArrayList<Produto>)`: Remove um produto pelo ID
  - `venderproduto(ArrayList<Produto>)`: Simula venda calculando total baseado em quantidade

### Classe `Main`
- **Propósito**: Ponto de entrada da aplicação com menu interativo.
- **Funcionalidades**:
  - Loop principal com menu de opções (1-5)
  - Gerenciamento de produtos através da classe `Servicos`
  - Controle de IDs sequenciais para produtos
  - Encerramento controlado do programa

## Conceitos de POO Demonstrados
- **Encapsulamento**: Atributos privados com getters/setters
- **Abstração**: Classe `Produto` representa conceito real de produto
- **Composição**: `Main` usa `Servicos` que opera sobre `ArrayList<Produto>`
- **Interação**: Métodos que colaboram entre classes

O sistema permite adicionar, listar, deletar produtos e simular vendas, mantendo tudo em memória durante execução.
