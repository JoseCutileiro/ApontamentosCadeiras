# Aula 21 (redes)

#Revisões

## Protocolos de acesso particionada (à vez):
```
Eficiente e justo (muito trafego): Quando há muito trafego

Ineficiente: Quando há pouco trafego)
1/N largura de banda para cada nó
```

## Procotolos  de acesso aleatório
Eficientes quando há MUITO trafego

## Protocolos de acesso ordenado

# Baseado em turnos
```
Um nó mestre que controla os outros

Problemas
1. Latencia de mestre para escravo
2. Um unico ponto de falha -> Quando este falha dá merda
```

# Passagem de testemunho (token)
```
Controlo que é passado de nó para nó em sequência

O token é um ponto de falha único
Latencia
```

# Redes LAN (Local area network)
```
Endereços IP:
- 32bits
- Usado para encaminhamento na camada 3

Endereço MAC
- Usado localmente

Porquê 2 endereços diferentes?
```

## Endereços LAN
- Cada adaptador tem um endereço LAN único

> Analogia \
> Endereço MAC: nr de segurança social \
> Endereço IP: Endereço postal

Endereço IP é hierarquico <-> Não é portável

## IP -> MAC
IP muda se eu mudar de rede \
Como é que eu através do endereço IP consigo determinar o \
endereço MAC?
```
Tabeça ARP address resolution protocol

ARP: mesma LAN

1. X quer enviar um datagrama a Y
Mas o endereço MAC de Y não está na tabela de X
2. Broadcast que contém o endereço de Y
3. Y recebe o pacote ARP e reponde a X com o seu endereço MAC

"plug-and-play"

TCP: Funciona apenas para Unicast
```

## Routing para outra LAN
```
Enviar datagrama de X para Y (LANs separadas)

Socrative

DNS: Descobrir o endereço IP de Y
DHCP: Endereço router de saida
ARP: Devolve MAC se lhe deres o IP
```

## Ethernet
```
Tecnologia LAN com fios dominante
```

1. Toppologia
- Bus (barramento)
- Estrela: A mais comum hoje
> Há um switch ativo no centro da rede \

2. Estrutura de uma frame ethernet
- Preambulo 7 bytes > Inicio do pacote (sincronização)
- Endereço MAC
- Tipo: Endreço IP
- CRC (cyclic redundancy check)

## Serviçço connectionless
- Não é necessário estabelecer nenhuma ligação
- Não oferece garantias de fiabilidade

## Switch ethernet

