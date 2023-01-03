# Aula do miniprojeto 2

## Algoritmos de routing

## Objetivos:
1. Simulador
2. Como funcionam os algoritmos
3. Como submeter

## Algoritmos

1. Link state
2. DV
3. DV RPP
4. Path Vector

## Como usar o simulador

notify link change (vizinho, novo custo) \
notify receive message (sender mensagem) \
\
Cada nó só comunica com os vizinhos

## O que é uma topologia?

```
O próprio grafo

- Testes pessoais:
- Mais que 4 nós é desnecessário
- Timestamp: 1 -> 2 -> 3 -> ... -> 253

<Tempo> <A> <B> <Custo>
```

```
COST_ADD() -> Evitar overflows com o COST_INFINITY

set_route() > Muda o estaod interno que o simulador esta a usar

destino, next hop, custo

Se quiser ir para o vermelho para o verde tenho que ir para o azul com usto 2
```

send_message > (current node, message)

## Nota: Não usar global/static variables > Batota x)

## Estado somo nós que criamos isto

```
Distance vector > Problema: Count to infinity
Reverse path poisoning > Evita este loops (loops de 2)
Path vector > Vê loops maiores (loops multiplos)
Link  state > Partilhar a topologia concretamente
```
