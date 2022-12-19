# Aula de apoio (mini projeto)

## Objetivos:
1. Entender funções base do UDP

2. Funcionamento base do projeto
```
Input file -> SENDER -> RECEIVE -> New file
```

## Overview: Files to chunks
```
1. Each chunk -> 1000 bytes
2. Nota: __atribute__((__packed__)): Evitar que o compilador faça marotices
```

## Estruturas no projeto
1. Pacote de dados
2. Pacote de acks

```

Nota:

hton: Host to network
utoh: network to host
```

## Selective acks :
Permite fazer com que o algoritmo seja GENÉRICO entre
1. Stop and wait
2. Go back n
3. Selective repeat

Sequence number em TCP: Número de bytes transmitidos

```
Selective acks:

Recv.Window -> 3
(só precisamos de 2 bits)

Selective acks: 0b00 (Não foi perdido)


Ack 1,00 -> Manda-me o 1, eu não tenho nem o 2 nem o 3
Ack 1, 01 -> Manda-me o 1, eu tenho o 2 e ainda não tenho o 3
Ack 1, 11 -> Manda-me o 1, eu tenho o 2 e o 3

01: Já recebi 1 pacote à fente do suposto

11: Já recebi 2 pacotes à frente do suposto  (base)

0 -> Não recebi
1 -> Recebi
```

Nota: SOCK_DGRAM -> Socket UDP \
Nota: SOCK_STREAM -> Socket TCP \
\
Socket flags:
```
SOCK_ADRESS: Permite reutilizar o socket
SOCK_TIMEO: Adicionar timeouts
```

## Advice: Debugging
[graficos]
