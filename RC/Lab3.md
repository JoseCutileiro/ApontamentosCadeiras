# Lab 3: Understanding HTTP

### HTTP (Camada de aplicação)

Começar com a camada de aplicação simplifica o \
processo de aprendizagem

## Sumário: 
```
> Camada de aplicação
> Camada de transporte
> Snooping encriptação e seguranç
```

## HTTP: 
 
Protocolo de camada de applicação, \ 
a camada de aplicação está próxima do user final \
Basicamente: Enviar e receber documentos.

> Internet: Computadores interligados \
> www: Aplicação para enviar documentos \
> Hypertext -> Hyperligações para linkar outros documentos

### Request types:
1. GET: Pedido de um documento
2. POST: Publicação de um documento
3. PUT
4. DELETE
5. [...]

### Dependencia de recursos:
```
Exemplo: 
GET /

	Status: 200 [OK]
	400 -> [CLIENTE FALHOU]
	404: [DOCUMENTO PEDIDO NÃO EXISTE]
	500 -> [SERVIDOR ERROU]
```

## Ligções persistentes e não persistentes

Ligação TCP: Permite uma tranferência com \
confiança. Para isso acontecer precisamos de \
um SOCKET (sessão). 

Persistente: Abrir um SOCKET e fica
Não persistente: Abrir e fecharr um SOCKET

> Comando netstat: Ver as portas abertas

## Virtual hosting:

IP: Identifica a máquina do servidor \
Caminho: Também poderá ser o mesmo para ambas \
	exemplo:
		> dogs -> GET /
		> cats -> GET /
Como distinguir? 
> Cliente especifica o host \
> exemplo: \
> GET site A /

## Authenticação é muito importante: 
> Não fazer login em sites marados (sem HTTPS) \
> ou em redes públicas \
> É fácil fazer uma análise rápida e ter acesso \
> a informação de terceiros.

### GoBuster: Encontrar páginas escondidas

> gobuster -dir (--url ou [Victim IP]) --wordlist [directory] \
>[directory]: Path para a wordlist

### John the reaper: Crack passwords

