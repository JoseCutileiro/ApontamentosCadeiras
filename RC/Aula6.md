# Aula 6

## Relembrar:

> 1) \
> Ligações persistentes \
> Ligações não persistentes \
> 2) \
> HTTP é stateless: \
> 	Vantagem: Mais simples -> Escala melhor \
>	Desvantagem: Não podemos 'conhecer' o user \

## Como conhecer o user?

> Para conhecer o user temos que guardar \
> de alguma forma o user. Como é que fazemso isto?
> COOCKIES :)

## Cookies: Manter "estado"

set-cookie: Cria uma cookie quando o user se conecta \
ao servidor pela primeira vez. \

cookie: User troca cookies com o servidor

### Controvérsia: privacidade

```
Momento socrative: [SOBRE COOCKIES]
> É BOM
> Não sei
> É MAU
```

## Web caching

> Objetivo: \
> satisfazer pedidos dos clientes \ 
> sem envolver diretamente o servidor \
> original \
> \
> User: Browser acede à Web via cache. \
> \
> O que é um proxy: Um servidor mais próximo \
> Proxy: Evita manter estado por cliente, \
> um cliente pode teoricamente encher  a cache sozinho.

- Vantagem:
1. Reduz tempo de resposta
2. Facilita o trafego no servidor

- Problema: 
1. E se o servidor já atualizou para uma nova versão ou não?
2. Como resolver este problema

## GET condicional
```
Objetivo: Não enviar objeto se a cache ESTIVER 
atualizada.

if-modified-since: <data>

304: Not modified
200: OK -> Retorna dados
```

Assim fechamos o protocolo da camada de app (HTTP)

# FTP: File transfer protocol

Ideia: Transferir ficheiros entre terminais remotos

1. Cliente: inicias a transferencia
2. Servidor: Terminal

- Servidor ftp: port 21

## FTP: Canais de controlo e canais de dados

FTP: Usa o TCP para garantercompletude do pacote

```
Ligação de controlo:
FTP contacta servidor FTP no porto 21 (com TCP) 

Ligação de dados:
Servidor recebe um comando de tranferencia e abre uma 
segunda ligação (uma ligação por ficheiro)
```

### Principios importantes:

1. Ligação de controlo é "out of band"
2. Transmissão de dasdos é "in-band"

O servidor FTP mantém "estado" -> Stateful


# Correio eletrónico 

## SMTP: Primeiro protocolo para correio eletronico

> Simple mail transfer protocol

1. Agentes: User
2. Servidor

- Os servidores armazenam mensagens destinadas ao utilizador
- SMTP é usado ENTRE servidores de e-mail para enviar mensagens
- Também podemos usar SMTP do cliente  para o servidor 
- (mas nunca do servidor para o cliente)

```
Caracteristicas:

	Utiliza o TCP
	Porto: 25
	Requisito: Fiabilidade (não há cá telefone estragado)

Transferencia direta do servidor emissor para o servidor destino
```

## Comparação com o HTTP

1. SMTP utilza SEMRPE ligações persistentes.
2. SMTP é do tipo PUSH -> cliente empurra mensagens para o destino
3. HTTP é do tipo pull -> cliente puxa o objeto que está na web
4. SMTP: Vários objetos são enviados através de uma única mensagem
5. HTTP: Uma mensagem <-> um objeto

## Agora queremos ir buscar coisas ao email: POP, IMAP e até o HTTP

### POP:
```
Muito simples e stateless
```

### IMAP:
```
Mais complexo e mantem estado
```

# DNS: É um protocolo e uma infraestrutura

> As pessoas têm muitos ids - c.c, nome, istID ... \
> Os computadores também: \
> nomes: Yahoo.com - Fácil para humanos \
> Endereços IP (32 a 128 bits) - Fácil para máquinas \
> DNS: base de dados distribuida e replicada

## DNS: Domain name system

Inclui ainda um protocolo: Nivel de aplicação

Caracteristicas:
1. Corre sobre UDP
2. Utiliza o porto 53
3. Mais uma vez deixamos a complexidade na "edge"

### DNS: Serviços

1. Tradução e resolução de endereços
2. Múltiplos nomes (host aliasing)
3. Nomes de servidor de correio
4. Balanceamento de carga

### O que é o Balanceamento de carga?

> Temos um servidor com vários ips \
> O DNS diz qual é o servidor com \
> a carga mais baixa.



