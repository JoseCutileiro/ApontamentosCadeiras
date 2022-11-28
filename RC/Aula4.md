# Aula 4: Redes de computadores

Os principais problemas da internet: 

1. Congestão
2. Segurança

Congestão: Ver aula anterior \

Segurança: A internet foi desenhada para ser usada entre comunidades \
amigaveis. Contudo escalou de uma maneira tal que atualmente é usada \
por todos (até por membros menos confiáveis).

## Medidas de desempenho:

```
tno = tproc + tfila + ttrans + tprop

tpoc: Processamento (geralmente em nanoseg)
tfila: Tempo que está no buffer à espera de ser enviado 
	   (geralmente em miliseg)
ttrans: Tranferência.Tempo para colocar o pacote INTEIRO na linha

			ttrans = tamanho_pacote / (débito - tligação)

tprop: Tempo de propagação (depende do próprio meio da ligação)

			tprop = distância / velociade_de_prop
```

## Traceroute:

Ver o trajeto e o atraso dos pacotes enviados \

### Exemplo:

- Traceroute MIT.com
- Self ---> Ulisboa ---> FCCN ---> Alemanha ---> EUA ---> MIT.com

## Perder pacotes enviados:

Quando o buffer está cheio existe uma libertação dos pacotes mais antigos \
e acabamos por perder pacotes.

1. TCP: Tenta reenviar pacotes perdidos
2. UDP: Caga nos pacotes perdidos

## ThroughtPut: 

Diferntes ligações: Largura de banda diferentes

```
									(cabo 2)
	(cabo 1)				______________________
__________________          |                     |
|________________| <------> |                     |
                            |_____________________|

Cabo 1: Bottleneck da ligação (se 1 e 2 são feitos do mesmo material)
		É o cabo 1 que define o tempo de ligação 
```

## Protocolos em camada:

A internet está definida em camadas. Facilita a \
abstação, reduz a complexidade e ajuda no design e \
na evolução/ escalabilidade da internet. \
\
As camadas de cima SERVEM as camadas de baixo
```
____------____
	 HTTP
  ___----___
   TCP/UDP
   ___--___
	  IP
```

### Analogia: Voar até à Tailândia

1. Comprar o bilhete 
2. Fazer o checkIn
3. Colocar a bagagem no porão
4. Ir em direção à gate no aeroporto
5. Entrar no avião 
6. Descolar
7. Aterrar na Tailândia
8. Retirar bagagem
9. :)

- Exemplo:
> Para *Retirar a bagagem* (8), preciso de \
> *Entrar no avião* (5) primeiro.

Cada camada IMPLEMENTA a camada de baixo

> **ROUTER**: \
> Camada de rede \
> \
> **SWITCH**: \
> Camada de ligação

## Protocolos:

App: HTTP
Transporte: TCP/UDP
Rede: IP
Dados: Ethernet
Fisico: bits

### Cintura elegante:

A camada _IP_ é fixa, e única. \
As outras podem evoluir de acordo com o \
estado atual das coisas.\

Quanto mais afastada a camada em causa está da camada _IP_ \
mais 'modificavel' será a camada criando uma cintura elegante \
em torno da camada do IP.

### Encapsulamento:

O encapsulamento existente na internet é causado pela concretização das \
camadas, permite mais flexibilidade e escalabilidade até a longo prazo.

## Próxima aula:

VPN: Facilitar a segurança e privacidade numa ligação (cliente gateway)
HTTP: Ligação simples
HTTPS: Dados transferidos estão encriptados

