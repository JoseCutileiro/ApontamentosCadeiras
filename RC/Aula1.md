### Aula 1: RC

Socrative : RC2223IST

### Redes de computadores e a Internet

> Ilegalmente: Informação \
> https://census2012.sourceforge.net

ISP: Internet service provider \
IXP: Internet exchange provider \

Site do stor: Our World in Data \

### Foco da cadeira:
> Como melhorar? \
> Vai escalar ainda mais 

### O que é a internet:
> Rede de redes \
> Interligar computadores 

1. Computadores
2. Ligações físicas
3. Encaminhadores: routers e switches (encaminhar pacotes)

def: pacote (unidade básica de comunicação) \

A internet permite que muitos seviços utilizem a mesma estrutura

```
Antes da internet:
> Havia uma rede para texto
> Uma rede para video 
> ...

Agora:
> Multiplos serviços e máquinas
```

### Internet: principios fundamentais

1. Internet é uma rede de redes
2. Serviço: "Best effort"
   > Faz o melhor possivel para cumpriar a \
   > sua função (sem promessas)
3. Inteligência na "edge"
   > End2End: A internet é burra \
   > a inteligência está nos computadores \
   > (facilita a escalabilidade)
```
Problema: Segurança
Agora nem todos os participantes são 
confiaveis.
```
4. Organização em camadas
> Modularidade: Camasas de baixo prestam serviço às de cima \
> Interfaces, abstrações \
> Camadas:
```
1ª: Lógica da aplicação - Qual é o protocolo utilizado - HTTP
2ª: Como se dá a comunicação entre processos - TCP (UDP)
3ª: Como se dá a comunicação entre computadores (longe) - IP
4ª: Como se dá a comunicação entre computradore (perto) - Ethernet
5ª: Transferência de bits
```

### Tópicos
1. Internet e estruturra
2. Camada de aplicação
3. Camada de transport
4. Camada de rede
5. Camada de comunicação de dados
6. Tópicos transversais (segurança)