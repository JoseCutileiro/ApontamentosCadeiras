# Aula 10

## Relembrar

1. go-back-in
> mais simples de concretizar

2. selective repeat
> Mais eficiente, mas mais dificil de implementar

### Mecanismos:
1. CheckSum
2. Temporizador
3. Números de sequência
4. ACK
5. NACK
6. Janela e popelining

## TCP:  Transporte fiável

> Visão geral do serviço oferecido: \
> \
> Ponto-a-ponto (1:1) \
> Entrega FIÁVEL e ORDENADA de streams de bytes \
> Controlo de fluxo: Destinatário não irá entupor o destinatário \
> Controlo de congestão: Emissor não irá entupir a rede \
```
1) Controlo de fluxo: É mais simples porque
o destinatário pode comunicar.
2) Controlo de congestão: É mais lixado porque a rede não
comunica.
```


### Estrutura do TCP

> CheckSum \
> Dados da aplicação \
> Sequence number: Número do primeiro bytes to segmento
> Acknowledgement number (número do próximo byte que quero receber)
> Flags do TCP
> -A : Acknowledgement (0=Acknowledgement number inutil, 1=Acknowledgement util) \
> Definir o tamanho da janela: Controlo de fluxo e congestão

## Número de sequência e ACKs

1. ACK -> Próximo byte esperado
2. Número de sequeância: Primeiro byte do segmento

> Como é que o recetor trata de segmentos fora de ordem?
> O TCP não especifica
> Guardar? (como o go-back-n) \
> Não guardar?

### Exemplo:

```
A)
Ultimo byte recebido do destino 1500
Vou enviar 100 bytes: [500,599]

Seq= 500, ACK = 1501, size = 100
-------------------------------->

B)
VOu apenas fazr um ACK (não envio dados)

Seq = 1501, ACK = 600, size = 0
<--------------------------------

A)
Vou enviar dis segmentos do mesmo tamanho
(e um vai perdr-se)

Seq=600, ACK = 1501, size = 100 - (PERDEMOS)
Seq=700, ACK = 1501, size = 100 - (CHEGA)

B)
Vou responder um ACK outra vez

Seq=1501, ACK=600, size=0
			^
			^
			^
	 ACKS sao comulativos
```

## Timeout e RTT

Relembra: \
	>>>	RTT: Round trip time -> Tempo de ir e voltar \
	>>> TimeOut > RTT (Se não está sempre a dar timeout)
	>>> O RTT é variavel

1. Se RTT pouco menor que timeout:
Prematuro -> Retransmissões desnecessárias

2. Se for muito maior
Reage muito lentamente a perdas

> PROBLEMA: \
> O RTT é muito variavel e dificil de prever \
> SOLUÇÃO: \
> Utilizar RTT estimado

### Como estimar?

Rttestimado = (1-a) x RTTestimado + a x AmostraRTT \
Valor tipico: a = 0.125 \
Não utilizar Rttestimado para timeout (prematuro) \
\
\
Timeout = Rttestimado + Margem de segurança \
(evitar timeouts prematuros)

Margem de segurnaça: 4xDesvioRtt

### Resumito TCP:

```
Protocolo pipelined
Usa ACKs cumulativos
Timer para retransmissões

Quando é que pode haver retransmissão:
1. TimeOUT (prematuro ou não)
2. ACKs duplicados
```

### TCP fast retransmit

Problema observado: O timeout costuma ser muito longo \
Provoca: Atrasos muito grandes \
Solução: ACKs duplicados \

### Estabelecimento de ligação TCP

```
> TCP 3-way handshake <

SYN: Só tem o bit syn ativo
SYNACK: Só tem o bit syn e o bit ack ativos

```









\
\
\
\
\
\
\
\
\
\
\
\

> Yellow :)


