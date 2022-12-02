# Aula 8

## Transporte

1. TCP: Entrega fiável e ordenada de pacotes
> Controlo de fluxo \
> Controlo de congestão \
> Estabelecer ligação


2. UDP:
> Extensão mais simples do IP \
> Não garante ordem nos pacotes \
> Não garannte que os pacotes cheguem

Estes protocolos não garantem ligações \
sem atraso e latência.

Apesar disso podemos ter algo na camada da aplicação \
que garante que os dados são consistentes \

USAR UDP != NÃO TER FIABILIDADE

## Multiplexagem/Desmultiplexagem

Faço a multiplexagem de muitos processos e depois \
faço a Desmultiplexagem.

### Como funciona a desmultiplexagem?

> Identificar uma ligação especifica \
> \
> IP emissor, IP rector, port emissor, port destino

### Criar um socket (UDP)
> Datagram socket1 = new DatagramSocket(12345); \w
> É a aplicação que decide qual é o cliente que a contactou

### Socket TCP

> IP origem, porto origem, IP destino, porto destino \
> O servidor pode suportar MULTIPLOS sockets TCP para o mesmo \
> socket destino. \
> Vários sockets diferentes para vários clientes \
> Facilita a gestão na aplicação.
> Já para o UDP o temos que fazer a filtagrem para cada cliente
> explicitanto várias caracteristicas.

### UDP (Transporte não fiavel)

```
Fiabilidade com UDP:
exemplo:

void send() : error_check
// Error check -1 if receiver did not receive

[...]

	error_check = send()
	if (error_check == -1) {
		UDP_failed_handle();
	}

[...]
```

Onde usamos o UDP?
1. Utilizado bastante em streaming de multimédia
2. DNS

### Vantagens UDP:

1. Não há atrasos a Estabelecer a ligação
2. Stateless (facilita o lado do servidor)
3. Cabeçalho pequeno

### CheckSum no cabeçalho do UDP?
Objetivo:
> Detetar "erros" no segmento transmitido

Algoritmo [EMISSOR]:
> Conteudo do segmento em inteiros de 16 bits \
> adição em complemento para 1 \
> Trocar a ordem dos bits não altera nada \

Algoritmo [RECETOR]:
> [...]

### Exemplo complemento para 1:
(soma de binários e fazer o inverso)

E se  der overflow?
> wraparound: Passar o 1 para o bit menos significativo e somar

Não esquecer de fazer o inverso

