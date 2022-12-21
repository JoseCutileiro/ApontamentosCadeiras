# Aula 17 (redes):

## Solução: Switched programaveis

Linguagem p4 -> Linguagem para programar switch programaveis

## Algortimos de Routing

```
Algortimo de router: Correm no proprio router
(exceto com SDN -> Correm no controlador)

Plano de dados -> 100Gbits/S

ALgoritmo de router -> Pode demorar segundos
(não há problema porque as mudanças da rede sao lentas)
```

## Grafo de rede:

- G(N,E)
```
Relembrar Grafs
> Vertices do grafo
> Arestas -> (com um custo associadas a cada aresta)
```

## Algoritmos de routing
Objetivo: Encontrar percurso de custo minimo na rede

```
Propriedades dos algoritmos:

1. Estáticos:
	>> Rotas mudam lentamente
	>> Configuradas MANUALMENTE
2. Dinâmicos:
	>> Rotas mudam rápido
	>> Atualizações periodicas
```

```
Proprieades da informação:

1. Informação global
	>> Routers tem noção global da rede
	>> Algoritmos "link state"
	>> Routers partilham informação local com os outros
	>> Partilha a TOPOLOGIA
2. Informação descentralizada
	>> Routers apenas conhecemos nós dos vizinhos
	>> Routers partilham informação de toda a rede com os vizinhos
	>> Algoritmos "vector distance"
	>> Partilha o CUSTO
```

## LinkState: Dijkstra
- Broadcast controlado (se não os pacotes iriam voltar para mim)
- Resultado: Todos os nós conhecem a topologia da rede
- Cada nó calcula o percurso minimo entre o proprio e os outros
- Recalcula periodicamente

>>> Encontrar o nó ao qual eu checo com o **custo minimo**

## Vetor distância: Bellman-Ford
>> Este algoritmos é destribuido (todos eles fazem partes diferentes do algortimo) para chegar à grande  solução

### Protocolo RIP, IGRP, etc...

## Notas
```
dijkstra: Qual é o melhor caminho de R8 a cada nó
bellman-ford: Qual é o melhor caminho de cada nó ao R8
```
## Mudanças no custo da ligação

"As boas noticias propagram rápido" \
"As más noticias nem por isso" \

> Ciclo \
> Count-to-infinity > Loop na rede \

## Comparação de algoritmos
