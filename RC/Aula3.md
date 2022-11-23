# Aula 3: Redes de computadores

> Nota inicial \
> Onde está '#' ver os apontamentos fisicos


## Aula anterior

1. Core
2. Parte da extremidade


> parte da extremidade
```
Sumário da aula anterior
(redes com fio)

Dedicado ou partilhado
Taxas de transmissão
Qualidade

1. ADSL
2. Cabo
3. Fibra ótica
```

> Core \
> Malha de routers interligados \
> pacote: unidade básica de comunicação na internet \
> um pacote é autonomo. \
> [====DADOS====|DESTINO]

## Comutação de pacotes
Exemplo: internet

> Autonomo \
> Sabe para onde vai e vai sozinho \
> Não há reserva de caminhos \
> Não há estado na rede (#1) \
> Os recursos não são dedicados \
> A partilha de recursos é muito importante (+eficiente)

## Alternativa: Comutação de circuitos 
Exemplo: Rede telefónica

> Ligação entre a origem e o destino \
> Existe reserva de caminhos: \
>	  1. Permite velocidades mais rápidas \
>	  2. O pacote não precisa de metadados \
> 	  3. Demora a iniciliazar/reservar os caminhos \
> 	  4. Recursos dedicados a cada ligação \
> Os pacotes não são autonomos
> Problema: Há muito desperdicio de recursos neste caso

### Exercicio

> Comutação de circuitos:

- USER:
- Uma ligação de 1Mb/s,
- 100kb/s qd está ativo,
- Está ativo 10% do tempo,
- comutação máxima de circuitos: 10 users

> Comutação de pacotes:

- A probabilidade de ter mais que 10 ativos ao mesmo tempo
- é 0.04% se tiver 35 users
- Ganho estatistico: Multiplexagem estatistica

### Principio store-and-forward

> O pacote tem que chegar na totalidade ao router antes \
> de poder ser transmitido na ligação seguinte \
> Um pacote de L-bits demora L/R segundos a ser transmitido numa ligação com R de velocidade

### Redes de comutação de pacotes: Filas de espera

Problemas:
1. Pode haver perda de pacotes: Se o buffer encher -> Fila demasiado cheia
2. +Latência: Se houver mais pacotes que o suposto -> Fila

## Qual é a técnica vencedora?

> Ambos são bons, depende do dominio

### Comutação de pacotes:
1. Partilha de recursos
2. Simples e escalável (não há estado)
3. Complicado dar garantias: Congestão
   1. Solução: Protocolos que controlam a congestão > TCP
   2. (TCP: Transmition control protocol)
   3. Protocolos de congestão não correm na rede, correm nos terminais
   4. A complexidade não está na rede -> Está sim nos terminais

### ISPs (internet service providers) 
- Residenciais, empresariais ou universidades

> Estes ISPs têm que estar de alguma forma interligados \

Existem MILHARES de ISPs, como fazer esta ligação. \
Não dá para interligar todos com todos (N*N ligações) \
(são 70 000 ISPs logo precisarimos de 70 000 * 70 000 ligações) \

ISPs -> ISPs Globais -> IXP (mega ISP)(interligar isps globais) \
Existem ainda regional net



