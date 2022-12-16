# Aula 15

## Como interligar interfaces entre si?

### Subredes

```
endereço IP
- bits mas significativos: Subrede
- bits menos significativos: Computador/router
```

**Socrative**:
/24 \
6 subredes \

## Estamos na mesma subrede?

### CIDR: Classless Inter-Domain routing
Source || Dest || Netmask \
\
Estão na mesma rede se bits da mesma mask a 1 forem iguais em \
source e em dest\

**DICA:** Passar para binário

### Originalmente: Class system
Class A - 8 bits para prefixo de rede, 2^24 - 2 computadores \
Class B - 16, 16 \
Class C - 24, 8 \
CLass D - Multicast \
Class E - \

Problema: É uma solução estática (Class B esgotou rapidamente)

## Como encontrar os ips : DHCP

Servidor DHCP envia em broadcast as suas respostas \

Como identificar qual é o cliente que fez o pedido?
> transactionID \
> Nota: broadcast usa UDP

## Como é que uma rede obtem um endereço IP?

ISP providenciam os seus Ips \
\
ICANN: Dividido em regioes, cada regiao arranja Ips para ISP

## Endereçamento hierárquico
Permite a agregação de rotas: O routing fica mais eficiente

> __Problema: Flexibilidade__ \
> Como resolver? \ 
> Prefixo com rede mais pequena tem máxima prioridade \
> Possivel problema: Redes com o mesmo prefixo 

### Socrative: 
```

Os pacotes vão para ?
A->3
B->4
C->1
D->1
E->2

resposta: Sim 
```

## NAT: Network address translation 

Temos um endereço de IP publico e um endereço de IP privado 
Os datagramas que saem do nosso computador utilizam o ip do router

Vantagens: 
1. Endereços internos são livres
2. Podemos mudar de ISP sem afetar o local
3. Dispositivos locais nao sao visieis de fora 
4. Não consumir endereços IPV4


