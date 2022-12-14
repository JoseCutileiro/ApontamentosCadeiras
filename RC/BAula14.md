# Aula 14: Redes

## Longest prefix matching: Desempatar os prefixos

Regra: O prefixo maior ganha -> rede mais pequena ganha (mais especifico) \

Estamos num router, preocupados em fazer match com uma tabela \

### SOCRATIVE

Exemplo:
128.16.16.0/21

Vai desde: **128.16.16.0** até **128.16.23.255**

```
Solução:
A : 0
B : 3
C : 2
D : 1
```

## Portas de entrada:

[Nao passei isto :(]

## Modulo de comutacao:

Para N entradas a taxa deveria ser N vezes o valor da velociade da linha idealmente.

> Primeira geração de swiches: \
> Os pacotes eram copiados para a memoria do sistema \
> A celociade é lmitada para largura de banda da memoria \
> Limitações: Barramento de memória
\

> CrossBar:
> Switching é feito através de redes de interligação: \
> REDE DENTRO DOS SWITCHES \
> Vantagem: Paralelismo (+speed)

## Portas de saida:

> buffering -> Mais rápido \
> Algoritmo de escalonamento

## Neutralidade da rede:
```
A rede deveria ser neutra ou não?

_SOCRTIVE_:
```

## Formato datagrama IP:
Tipicamente o tamanho máximo dos pacotes é 1500 bytes \


## Camadas: Aumentam tamanho do pacote

> Até agora:
20 bytes: TCP \
20 bytes: IP

## Fragmentação e remontagem

MTU: Maximum transfer size
O pacote IP tem de ser dividido na rede (fragmentação) -> Depois há remontagem no destino

### EXEMPLO:

Datagrama de 4000 bytes \
MTU: 1500 bytes \
offset [...]
