# Redes de computadores (aula 22)

## Interligação de switches
- Os switches podem estar interligados
- Basta correr um algortimo de self learning
- Problema: Ciclos
- Se houver ciclos -> Dá merda
- Usar protocolo spanning tree para remover ligações redundantes

exemplo
```
Rede institucional

[...]
```

## Switch vs router
1. Ambos têm tabelas de store & forwarding
2. Router: Camada de rede
3. Switches: Camada de ligacao de dados

# VLANs (virtual local area network)

```
motivação:

Docente do DEI vai mudar de escritorio, mas quer continuar ligado ao
switch do DEI

1. Haver um único dominio broadcast
- Todo o trafego da camada da ligacao tem de cruzar TODA a LAN

>> Problemas:
>> 1. -eficiencia
>> 2. -segurança e privacidade
>> (as redes ethernet não escalam bem)

2. Solução > VLAN: Virtual LAN
```

## Como funciona?

1. As portas do switch podem ser  agrupadas por rede virtual
```
Metade do switch vai para o Departamento de Informática
e a outra metade vai para o Departamento de Quimica
```

Vantagens
```
Isolamento de trafego
Acssociacao dinâmica
```

## Como é feito forwarding entre VLAN?
```
Através de routing
(tal como seria feito com switches separados)

- Precisamos de ir à camada 3
```

## Data center
```
Centenas de milhares de  computadores

Grandes desafios
1. Muitas aplicações
2. Muitos clientes
3. Gerir e balancear a carga nos servidores
```

As nossas soluções não escalam a esta escala
Como resolver isto?

## Balanceador de carga

# Rede de um data center 
- Muitas ligações (rede tipo CLOS)


# Redes sem fios 
```
Objetivos: Desafios de redes sem fios

Porque?
1. Mais redes moveis 
2. Mais necessidade de trabalhar com redes sem fios
```

## Principais desafios
Comunicação usando ligações sem fios
1. Iterferencia de outros sinais
2. Atenuacoes de sinais
3. Reflexoes de sinais
4. Os utilizadores são MOVEIS

## Elementos de uma rede sem fios

[...] 

*ver nos slides*

# adeus



