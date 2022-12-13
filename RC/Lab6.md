# Lab 6 - TCP

> Camada de transporte -> TCP

## Understanting TCPand using TCP sockets

```
Com que aplicação é que queremos falar do lado
de lá?

O TCP e o UDP tratam disso

** Projeto **

é nos dado um protocolo muito simples UDP
objetivo: Tornar realiable
```


## SOCKETS

É uma abstração -> é como escrever para um ficheiro

APPx <-> SOCKET <-> APPy

## TCP handShake:

O TCP tem que garantir que o terminal origem está realmente \
conectado com o terminal final

### TCP
1. Camada de aplicação
2. handShake
3. Reliable transfer
4. Controlo de fluxo
5. Controlo de congestão

> (4 e 5): Eu não sei a que velocidade posso enviar dados \
> Flow control: A pessoa que estou conectado pode aguentar com o que eu vou enviar? **recvWindow**\
> Controlo de congestão: A rede que estou conectado pode aguentar com o que vou enviar?

## Como é que sockets funcionam?

RPC: Remote procedure call

Lado do servidor:
```
Criar socket
Bind to a port
Listen -> Abrir o porto para o cliente se possa conectar
Accept -> Chamada bloquente: Fica à espera de uma ligação

>> ciclo: reads e writes

close
```

Lado do cliente:
```
Criar socket
Connect to a port (& given IP)


>> ciclo: reads e writes

close
```

## **TCP header and flags**

## Congestão: Muitas fontes enviam muitos pacotes demasiado rápido

# Como é que o TCP lida com a congestão?

1. Slow start fase (crescimento exponencial até threshold)

2. Congestion avoidance (crescimento linear até ponto de congestão (perda de pacotes ou duplicate ACKSs))

3. Recovery:
- Timeout: Passar cwnd para 1
- duplicate acks: Passar cwnd para metade

## DUPLICATE ACKs

1. Fast retransmition ()
```
Pacotes:
[1] [2] [?] [4] [5]

ACKs:
1 2 ? 2 2

Acks duplicados base 2 => Falta o 3

```





