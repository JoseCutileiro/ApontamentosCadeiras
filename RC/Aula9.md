# Aula 9

## Transferência fiável de dados: princpios

> Importante em todas as camadas (aplicação, transporte ...) \
> Está no TOP 10 dos problemas em redes

### Canal fiável:
> Enviar e receber dados de vários processos

Camada de transporte -> Permite tornar um canal \
não fiavel (IP) num canal fiavel.

> A complexidade do protocolo de transmissão depende das caracteristicas \
> do canal não fiavel

## Deteção e recuperação de erros

O canal de comunicação

1. O pacote pode perder-se (filas cheias)

2. Como recuperar?

> 1) Através do feedback \
> ACKS (não recebi) e NACKS (recebi)\
> No TCP usamos ACKS \
> \
> 2) Retransmitir o pacote

## E se o error estiver noo ACK/NACK (ou se estes se perderem)

> Mais uma vez poderemos retransmitir o pacote ... \
> Mas então iremos ter o problema de repetição de pacotes \
> Ou então... \
> Enviar pacotes com um ID de cada pacote

# Primeiro protocolo: stop-and-wait

> Envia pára e espera, não chega ACK (resposta de tudo bem)? \
> Reenviar

### Socrative

O protocolo tem impacto direto na velocidade de transmissão dos \
vários pacotes. \

Se o RTT é tão grande então -> ENVIO vários pacotes

## Pipelining

Vou agora enviar multiplos pacotes para \
usar sempre o mesmo RTT.

```
Esta solução tonra as cosias mais complexas
(remove a simplicidade)
```

## Go-back-N (GBN)

> Emissor pode ter até N pacotes "in-flight" \
> (n pacotes -> cotrolo de fluxo) \
> \
> Destinatário envia ACKs comulativos \
> -> manda me o segmento em falta; até lá nao faço nada  \
> -> Isto permite SIMPLIFICAR o emissos \
> Desperdicio de recursos na rede -> menos eficiente \
> Só há um timer no emissor

> O recetor não guarda estado \
> Os ACKs são comulativos: \
> Justificam o para trás \
> Justifica o passado também se um mais recente for entregue


Conceitos:
1. Janela do emissor (N)

** Ver a animação girita

## Selective repeat
```
Um timer por pacote
```

** Ver animiação gostosa do link


# Tabela resumo:

|------------------| |     ACKs     | |        TIMER        | |         Reenvio          |  \
\
	    GBN             Comulativos    Segmento mais antigo      Todos a partir da falha \
\
  Selective repeat      Individuais         Por pacote                Só o perdido


