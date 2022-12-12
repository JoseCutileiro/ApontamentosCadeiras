# Apontamentos: Aula 12 (redes)

## TCP Controlo de congestão:

## Fases:
```
#1 Arranque lento: Slow start (crecimento exponencial)
>> Inicio: cwnd = 1
>> Crecimento exponencial

#2 Prevenção de congestão:Crescimento linear
>> Crecimento linear
>> cwnd += 1 por RTT
>> redução é multiplicativa:  cwnd /= 2

#3 Recuperação:
>> Perda é detetada por __timeout__ => cwnd= 1
>> Perda é detetada por ACKs duplicados => TCP RENO: cwnd/=2
										=> TCP TAHOE: cwnd = 1

==============================================
Problemas:
>> Na prática
>>>> Os RTTs estão sempre a mudar
>>>> Está tudo em constane mudança
```

## Taxa de tranferencia média

1. Tamanho médio da janela -> Média da cwnd

2. RTT -> 1 RTT

** SOCRATIVE **
> [16,24] \
> Slow start threshold: Valor que pára o crescimento exponencial: \
> Janela \média: Valor médio da cwnd

## Vamos falar de justiça:

```
K ligações TCP, que partilham o mesmo gargalo (com largura de banda R)
cada um devia receber K/R.

TCP é justo?
>> SIMMM!!!

E se eu quiser ser injusto?
1. Usar UDP
2. Usar multiplos TCPs em paralelo (os browsers fazem isso!)
```
> Vamos sair da edge

## Camada de rede:

Qual é o problema que esta camada quer resolver?
> Como interligar MUITOS dispositivos

Objetivos
1. Perceber os principios base dos serviços da camada de rede
- Modelos de serviço
- Forwarding
- Plano de dados vs planos de controlo
> Como funciona um router? \
> Algoritmos de routing \

### Camada de rede: [IP]

- Transporte de datagramas (entre computadores)
- Os protocolos desta camada correm em nós terminais **E TAMBÉM nos routers**



