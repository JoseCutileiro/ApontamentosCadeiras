# Apoio ao projeto (v2)

(com o professor ferdinand)

```
Implementar 4 algoritmos

1. Link state
2. DV
3. DV with RPP (evita count to infinity simples)
4. PV(evita count to infinity de TODO)
```
Nota: O BGP usa path vector

# Ideia: Utilizar a API do simulador

```
notify link change > Com send message
receive change
```

## API CAlls

```
get current node
get first node
get next node
get last node
get link cost
COST ADD
```

### Como iterar todos os nodes?
```c
for (node_t n = get first node;
	 n<= get final node;
	 n = next node) {

	// CODE HERE

}
```

set_route()

```
Se quiser chegar ao destino, tenho que ir para next hop
com custo CUSTO
```

### Envio de mensagens
```
void send_message(vizinho,mensagem)

data = malloc(data)

message

msg.data = data
msg.size = sizeof(data)
send_message()
```

### Alterar estado do nó
```c
s = get state
s->data = //change data
```

Distance vector
> DV: Bellmand ford \
> Se alterar os caminhos -> Envia mensagem \
> Se não alterar -> Não faz nada \
> POISON \
> set reverse path = infinity \
> PATH VECTOR \
> Envia o caminho inteiro

Link State
> LS: Dijsktra \
> Estruturas adicionais para o link state \
> Partilhar com todos os nós a topologia
