# Aula 20 (redes)

## Onde é implementada esta camada?

1. Ligações ponto a ponto

> Ligações diretas ao switch: ethernet

2. Broadcast (meio partilhado)

> Ethernet original \
> HFC \
> Wifi 

```
Analogia:

1. Professor explica a matéria
2. Vasco fala com Vicente
3. Professor manda calar > Protocolo
```

## Protocolos de acesso multiplo
```
interferência -> Colisão

MAC: Multiple acess control (não tem nada a ver com a apple nem com segurança)
```

## Protocolo ideal
```
Canal partilhado com taxa de transmissão máxima (r)
Queremos manter esta taxa 
Temos M nós 
Taxa R/M
Totalmente descentralizado 

Não existe este protocolo (ainda não foi criado)
```

## Classes de protocolo

1. Particionamneto do canal 
> Dividir o canal em slots (frequencias, códigos)
2. Acesso aleatório 
> Toma o canal todo
3. Acesso ordenado ("À vez")
> Mais a enviar podem ocupar mais tempo

## Protocolos MAC

# Particionamneto do canal

## TDMA: time division multiple acess
```
O acesso ao canal é feito em rondas

Cada nó tem um slot com tamanho fixo (tamanho = tempo)

Taxa de tranmisssão é certinha
```

## FDMA: frequency division multiple acess
```
Dividimos frequencias par cada nó

Problema: Quando não usamos a frequencia: Desperdiçar a frequencia
```

## CDM: 
```
Temos acesso a todo o tempo e toda a frequencia 

+flexibilidade
+dificil de desenvolver 
```

# Acesso aleatório 
```
Ideia base: Envia à taxa máxima do canal 
Sem coordenação entre nós

1. Como detetar colisões 
2. Como recuperar de colisões
```

## Aloha
```
Quando o nó tem um frame para transmitir -> Transmite

É muito simples

Problema: Grande probabilidade de colisões -> Pouco eficiente 
```

## Slotted aloha
```
(versão melhorada)

Todas as frames tem  o mesmo tamanho 
O tempo é dividido em slots
Os nós começam a tranmitir no inicio de um slot -> Necessário sincronizar
2 nós no mesmo slot: Detata colisões 
Há uma probabilidade p, até ter sucesso

Vantagens: 
1. Só com 1 nó -> Taxa máxima 
2. Parcialmente descentralizado 
```

## CSMA (carrier sense multiple access):
```
Sentir o canal

- Desocupado: Transmite 
- Ocupado: Não Transmite

Mesmo assim podem ocorrer colisões:
Tentou ouvir mas não escutou
(Enviar pacotes mais ou menso ao mesmo tempo)


CSMA/CD: Enquanto estou a falar vejo se alguem está a falar
se falarem calo-me: Envia sinal "jam"

"jam": Acelera descoberta de colisão por todos

Deteção de colisões:
1. Fácil em redes com fios
2. Dificil em redes sem fios 

Depois de avortado o envio: binary(exponencial) backoff

Colisão entre #m
Escolhemos um número aleatoriamente entre (0 e 2^m-1) > K
K * 512 bits (unidade de tempo)
```
