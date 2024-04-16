# Teste de Estágio Target - AugustoKoch

Este projeto contém as respostas para o teste de estágio em desenvolvimento da Target Sistemas.
Neste arquivo seram encontradas as respostas das questões de 1, 3 e 4,
assim como as instruções para a execução dos arquivos que contém o código resposta das questões 2 e 5.

## Questão 1:
Ao final do processamento, o valor da variável SOMA será de 91.

## Questão 2:
Este código solicita um número ao usuário e responde se o número pertence ou não a sequência de Fibonacci

### Pré-requisitos
Certifique-se de ter o seguinte instalado em seu sistema:

- Java Development Kit (JDK) 21

### Como executar o projeto

1. Clone este repositório em sua máquina local ou baixe o arquivo ZIP e extraia-o.
2. Abra um terminal ou prompt de comando e navegue até a pasta src do projeto.
3. Execute o programa utilizando o seguinte comando:

   ```bash
   java Questao2.java

5. O programa irá solicitar um número, e em seguida, exibirá o número escolhido e dirá se ele pertence ou não a sequência de Fibonacci.

## Questão 3:
a) 1, 3, 5, 7, _9_

b) 2, 4, 8, 16, 32, 64, _128_

c) 0, 1, 4, 9, 16, 25, 36, _49_

d) 4, 16, 36, 64, _100_

e) 1, 1, 2, 3, 5, 8, _13_

f) 2,10, 12, 16, 17, 18, 19, _200_

## Questão 4:
A questão não pode ser resolvida usando apenas a lógica de lâmpadas acesas ou apagadas, é necessário imaginar que se pode checar a temperatura
das lâmpadas para verificar se estiveram acesas recentemente. Para descobrir qual interruptor controla cada lâmpada sem checar a temperatura,
eu ligaria o primeiro interruptor e verificaria a primeira sala, se a luz estivesse acesa, só precisaria voltar, desligar o primeiro interruptor,
ligar o segundo e verificar a segunda sala. Caso a luz estivesse acesa, saberia que o interruptor 1 liga luz na sala 1, o 2 na sala 2, e o 3 na sala 3.
Caso estivesse apagada, o interruptor 2 liga a luz na sala 3 e o 3 na sala 2. Se a luz da primeira sala estivesse apagada ao ligar o primeiro interruptor,
seria necessário que encontrássemos a luz acesa na segunda sala ao ligar o segundo interruptor, assim ainda poderíamos fazer a mesma associação.
Caso as encontrássemos as duas desligadas não seria possível saber qual interruptor controla cada lâmpada com apenas duas idas as salas. 


## Questão 5:
Este código tem como única função inverter uma frase e mostrar seu valor normal e invertido.

### Pré-requisitos
Certifique-se de ter o seguinte instalado em seu sistema:

- Java Development Kit (JDK) 21

### Como executar o projeto

1. Clone este repositório em sua máquina local ou baixe o arquivo ZIP e extraia-o.
2. Abra um terminal ou prompt de comando e navegue até a pasta src do projeto.
3. Execute o programa utilizando o seguinte comando:

   ```bash
   java Questao5.java

5. O programa exibirá a string original e sua versão invertida.
