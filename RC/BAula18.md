# Aula 18

## Revisão: Link state > Algoritmo de dijkstra

## Revisão: Vetor distância > Bellman Ford

### MiniLoops: As más noticias propagam-se devagar -> Count to infinity Solução: RPP
### MegaLoops: Solução: Enviar todo o path

1. vd: Com mini loops e mega loops
2. vd com rpp: Sem mini loops e com mega loops
3. sv: Sem mini loops e mega loops

# Routing hieráquico:
```
Até agora o nosso estudo de routing assumiu o cenário IDEAL
Problema de escala: Com MILHOES de destinos
>> Não conseguimos colocar todos os destinos nas tabelas de encaminhamento
>> A Troca de mensagens de routing INUNDA as ligações com este tráfego de controlo

Solução > Sitemas autonomos (noção de hierarquia)

AS: Sistema autonomo
> > > Cada AS escolhe o seu protocolo a utilizar
> > > Interligar todas as AS --- Protocolo especifico: BGP

intra-: Ligar dentro da AS
inter-AS: Ligar todas as AS
```

## Broadcast e multicast
```
Um emissor quer comunicar com TODOS os destinos

Possibilidade 1: Enviar pacotes do emissor para TODOS os nós diretamente
	Duplicar na fonte
	Muito ineficiente
	Como é que a fonte sabe quais são TODOS os destinos?

Na prática

Possibilidade 2: Duplicar na rede
```

## Como fazer o broadcast

1. Flooding: Enviar pacotes para todos os vizinho

Problemas
> ciclo infinito: Fico sempre a receber pacotes \

2. Flooding controlado: O nó faz broadcast do pacote apenas se não tiver enviado anteriormente

Problemas
> Tenho que guardar estado de que pacotes já recebi > não é escalavel

3. Flooding controlado com RPF: Encaminhar pacotes apenas se tiver chegado através do caminho mais curto
> RPF: Reverse path forwarding

Problemas
> Ainda há pacotes redundantes

4. Spanning tree: Permite que nenhum nó recebe pacotes duplicados

> Tabela de broadcast \
> Tabela de unicast

## Como fazer multicast (problem mais dificil)

Relembra: Só para alguns

**SOCRATIVE**
```
Que técnica permitiria usar multicast numa rede onde só
alguns routers "falam" multicast

>> túnel

Mesma técnica que IPV6 -> IPV4

```

# Árvores

## Abordagens

> Baseadas no emissor \
> Arvores partilhadas --- minimal steiner tree & center based tree

## Shortest path tree
A arvore dos caminhs mais curtos entre o emissor e todos os destinatarios
> Algortitmo de dijsktra

## Na prática: Usamos o reverse path forwarding

```
>> RPF: 
Resultado: SPT (shorthest path tree) baseada no emissor (mas invertida)

Isto permite fazer BROADCAST

Para fazer multicast > Pruning (corto os ramos dos que não estão interessados)
```






