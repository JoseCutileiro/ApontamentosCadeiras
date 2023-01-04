# Aula 19: Redes de computadores

## RPF: Reverse path forwarding

```
>> Assumir que a arvore já está feita

>> Fazer pruning:
Dizer explicitamente que não quero receber pacotes
```

## Steiner tree : Arvores partilhadas

> Não há algortimos eficientes \
> No entanto há boas heuristicas para solucoes aceitaveis

## Center based trees


# Socrative

PIM-SM vs PIM-DM \
\
Só a partir de  um dado número é que rende

## Camada de ligação de dados

Responde à questão:

1. Como é que nos ligamos à rede
2. Como é que comunicamos com os outros?

Objetivos:
```
Perceber os pricipios base dos serviçoes da camada
de ligação de dados

> Protocolos de acesso ao meio
> Auto aprendizagem
> Virtualização de rede

Ethernet

```

Introdução:
```
Computadores terminais e routers: nós
Canais de comunicação adjacentes: Ligações

frame: Encapsula o datagrama IP
```

Revisões:
```
Mensagem - camada de aplicação

UDP (datagrama) & TCP (Segmento) - Camada de tranporte

Datagrama - Camada de rede

Frame - Camada de ligação de dados
```


[incompleto ver slides] Analogia:
```
Viagem Lisboa Londres

Limusine: até lisboa
avião até londres

Estrada: Cabos

Agencia de viagem: Algortimos de routing
```

## Endereço MAC
Medium acess control

## Serviçoes desta camada
1. Framing
2. Entrega fiavel
3. Controlo de fluxo
4. Deteçao de erros

## Onde é que é implementada a camada?
Num adaptador de rede

> Relembra \
> Socket <-> ponto de ligação com o SO

**SOCRATIVE**

TCP continuairia a ser util? \
SIM
> Pacotes podem chegar desordenados

