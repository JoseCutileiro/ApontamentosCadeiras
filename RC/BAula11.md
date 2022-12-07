# [RC] Aula 11

O que está na berra em redes?
1. SIGCOM M
2. NSDI
3. CoNEXT

## Estabelecimento de ligação TCP

> Controlo de fluxo \
> Controlo de congestão

Antes de trocarem dados, o emissor e receter precisam \
de fazer um handshake

### TCP 3-way handshake

## Abrir ligação:

1. Cliente ----> syn

2. Servidor ----> synack

3. Cliente ----> ack
(já pode enviar dados )

## Fechar a ligação:

(não sabemos quem decide fechar a ligação \
vamos assumir que é o Cliente)

1. Cliente ----> FIN
```
Não irá enviar mais dados
(mas poderá receber)

```

2. Servidor ----> ACK
```
Sei que não vais enviar mais nada
mas ainda vou enviar uns quantos
```

> ENVIA AS COISAS QUE FALTAM

3. Servidor ----> FIN
```
Agora sim já não vou enviar nada
```

4. Cliente ----> ACK
```
Então tá bem, ligação terminou
```

## Controlo de fluxo

O recetor controla o emissor, para que \
este não encha o seu buffer. \
\
rwnd: RECEIVE WINDOW -> Free buffer space \
O recetor "publicita" no cabeçalho o espaço livre (rwnd) \
\
Assim gaarantimos que não enchemos o buffer

```
Problema: rwnd tem apenas 16 bits,
isto pode ser um problema (hoje em dia é)

Contudo é fácil de ultrapassar isto

Solução: Multiplicar rwnd por um certo escalar
(escolhido previamente)

```

## Controlo de congestão

Objetivo: Não entupir a rede

### Onde é que este problema aparece?

1. Perda de pacotes (Buffers cheios)
2. Atrasos (Pacotes à espera nos buffers dos routers)

### Custos da congestão:

Atrasos: Aumenta EXPONENCIALMENTE quando o envio de pacotes \
se aproxima da capacidade máxima

Retransmitir: Emissor tem que Retransmitir mais pacotes
(mais trabalho para os routers)

# Duas abordagens para este problema (controlo de congestão)

## End2End

1. A rede não envia feedback
2. A congestão é inferida pelo terminal
3. Aborgagem usada pelo TCP

## Auxilio da rede

1. Os routers enviam explicitamente **feedback** aos terminais
> >> Informação no cabeçalho dos pacotes a indicar que há congestão \
> O que isto permite? Desacelerar antes de dar merda
> >> Definir uma taxa máxima

** SOCRATIVE: **
> End2End vs Auxilio de rede \
> End2End: Mais escalavel \
> Auxilio de rede: Temos acesso à informação da rede

## TCP : Controlo de congestão

Não tenho ajuda vou testar até ter que abrandar,
volto a acelerar ... (repito)

```
Como é que um emissor deteta congestão?
1. Perda de pacotes
2. timeout ou 3 ACKs duplicados

Como é que um emissor controla a congestão?
1. Limita a janela de congestão (cwnd = número de segmentos in flight)
Tamanho da janela = min(rwnd, cwnd)

A rede não informa qual é o tamanho da janela
Ir testando
>> Ir aumentando até perder
>> Baixar
>> Ir aumentando até perder
>> [...]
```

## Algoritmo de controla de congestão:

1. Slow start
- No inivio a janela começa pequena e aumenta exponencialmente
2. Prevenção de congestão
- A partir de um limite (ssthreshold) a janela aumenta linearmente
3. Fase de recuperação
- Pode ser lenta (quando perda de pacotes: Reduzir janela para 1)
- Mais rápida (reduzir janela para metade)

### SLOW START (cwnd = 1)

- Inicio lento
- Aumenta RAPIDO
- Até ssthreshold (slow star threshold)
- Cada ligação TCP tem um ssthreshold distinto

### CONGESTION AVOIDANCE

- Incremento aditivo (linear por cada RTT)
- Decremento multiplicativo
- Redução dada quando perdemos um pacote --> PARA 1
- Redução quando chegamos a um máximo --> Para metade (/2)

### RECUPERAÇÃO

- Quando a perda é detetada por timeout: cwnd = 1
+ Voltar ao SLOW START

- Quando a perda é feita por 3 ACKs duplicados

1. TCP Reno: cwnd /= 2 [RIO RENO]
2. TCP Tahoe: cwnd = 1 [LAGO TAHOE]

Pela análise dos gráficos podemos prever se o nosso SO utiliza \
o TCP Reno ou TCP Tahoe.


