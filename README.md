# Conta Bancária em Java

Projeto desenvolvido em Java com foco na prática de lógica de programação e orientação a objetos.

## Sobre o projeto

Este sistema simula uma conta bancária no terminal e permite realizar operações básicas de uma conta, como consultar saldo, depositar, sacar e pagar boleto.

O projeto foi criado com o objetivo de praticar conceitos importantes da programação orientada a objetos em Java, como:

- classes e objetos
- atributos e métodos
- construtor
- encapsulamento
- uso de menu interativo
- regras de negócio

## Funcionalidades

- Consultar saldo
- Consultar valor do cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Verificar se a conta está usando cheque especial

## Regras de negócio

- A conta possui saldo e limite de cheque especial
- O valor do cheque especial é definido no momento da criação da conta
- Se o depósito inicial for de até R$ 500,00, o cheque especial será de R$ 50,00
- Se o depósito inicial for maior que R$ 500,00, o cheque especial será de 50% do valor depositado
- Se o cliente usar o cheque especial, será cobrada uma taxa de 20% sobre o valor utilizado assim que houver saldo disponível

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

## Estrutura do projeto

```bash
conta-bancaria-java
├── src
│   ├── ContaBancaria.java
│   └── Main.java
├── README.md
└── .gitignore
```

## Como executar

1. Clone este repositório:
```bash
git clone https://github.com/rhaone-brum/conta-bancaria-java.git
```

2. Abra o projeto no IntelliJ IDEA

3. Execute a classe `Main.java`

## Aprendizados

Durante este projeto, pratiquei:

- criação de classes em Java
- instanciação de objetos
- separação de responsabilidades
- uso de métodos para organizar regras de negócio
- entrada de dados com `Scanner`
- controle de fluxo com `if`, `else`, `switch` e `do while`
- versionamento de código com Git e GitHub

## Autor

Desenvolvido por **Rhaone Brum** como projeto de estudo em Java.