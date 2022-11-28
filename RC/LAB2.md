# Lab 2: Ferramentas de debug

1. IP
2. wireshark
3. iperf
4. ping 
5. traceroute

## IP address:

1. Control interfaces, routes, devices and tunnels

### IPV4
> exemplo:   \
> 10.0.1.10/24 \
> /24: quantos bits estão a ser usados para identificar a rede

### Interfaces:
> eht0 , eth1: Em cada máquina

## Traceroute:

1. Saber o caminho até às máquinas que estamos a conectar
2. Os switches são transparentes: Não são identificados pelo traceroute

Como é que isto funciona: 
> utiliza pacotes ICMP \
> Estes pacotes estão associados ao ping \
> Question and Reply \
> TTL: Quantas máquinas percorreu \
> Traceroute: Vai aumentando o TTL e vê onde chega com cada nr \
> Envia 3 pacotes: Por resiliencia

## Wireshark:

> Super duper debug program \
> Podemos usar para ver o trafego alheio ;) 

## ping: 

> Confirmar que há ligação entre máquinas

## iperf: Testar largura de banda

> Testar largura de banda entre o BOTTLENECK \