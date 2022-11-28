# Aula 5: Redes

## Relembrando: 

> Camadas + Pacotes = Encapsulamento \
> O encapsulamento é a materialização da organizaçã em \
> camadas numa rede de pacotes \

Cada camada: Necessita do acréscimo de mais informação \

### Na prática:

> Mensagem: [M] \
> Segue as diferentes camadas: [M|Ht|Hr|Hn] \
> A mensagem tem agora os vários cabeçalhos para tratar das diferentes camadas \
> Diferença essencial: Router e switch \
> O router permite passagem de pacotes entre routers \
> Swtich: Trata apenas de problemas locais

O que acontece na realidade é que precisamos de mais headers -> Mais segurança

Exemplo da VPN:

O que uma VPN faz é adicionar mais um HEADER que permite uma ligação segura até a um dado 
gateway

[IP|TCP|TLS|IP|TCP|MENSAGEM]

1º: IP,TCP e TLS -> Permitem a conexão a um gateway cifrado
2º: IP e TCP -> Sevidor 

## Camada de aplicação
```
***************************************************************
Problema: Diferentes apps <-> diferentes requisitos

exemplo: 
1. estou a tranferir um ficheiro: QUERO TODOS OS BITS, não há problema que demore
2. app tipo Skype: Não há problema em falhar um pouco mas não queremos atrasos 

TCP: Garante a integridade dos pacotes
UDP: Menos chato na integridade nos pacotes
***************************************************************
Objetivo:
1. Aspetos conceptuais e de implementação dos protocolos de app
2. Analisar alguns protocolos populares

Web: HTTP
Transferir ficheiros: FTP
Correio eletrónico: SMTP POP3 IMAP
tradução de endereços: DNS
```

### Criação de uma aplicação de rede
> Aplicação que corre em diferentes computadores \
> e comunica pela rede. \
> Não esquecer: APENAS os computadores terminais correm \
> os protocolos de aplicação. \
> Isto tem uma vantagem: Não é necessário escrever código \
> para os dispositivos de rede (routers / switches)

### Arquitetura
1. Cliente-servidor
> Servidor: Sempre ligado (termina), com endereço de IP permanente \
> Cliente: Não estão sempre ligados, IP dinâmico e \
> users não comunicam diretamente entre si

2. peer2peer
> Não existe um conceito de servidor (sempre ligado) \
> Os peers são os terminais do sistema. Comunicam diretamente entre si. \
> Sistema auto-escalável: Os peers servem-se mas também servem. \
> A gestão deste sistema é mais complexa: Não existe um nr fixo de peers.

### repletir.com
1. P2P: Com o aumento de peers o tempo aumenta logaritmicamente.
2. Cliente servidor: O aumento do tempo é mais ou menos linear.

## Comunicação entre procesos
1. Pipes: Envio de mensagens
2. Memória partilhada 

Computadores diferentes só permite \ 
comunicação entre processos por troca de \
mensagens.

Endereço de IP: Permite o acesso ao outro computador.
Precisamos da porta: (identificador do processo)
Exemplo: HTTP -> porta 80

## Socket
Os processos enviam ou recebem mensagens para ou de um socket
[Protocolo, endereço de IP, porta]
Interface simples: read(); write();

## Web e HTTP
Uma página web consiste num conjunto de objetos 
- Ficheiro HTML 
- imagens
- audio 
- ...
- Cada obj é identificado por um URL

exemplo: \

https://hostname/path0/path1/path2/obj \

https ->  protocolo

### HTTP: Visão geral
Segue modelo cliente/servidor 

> cliente: browser \
> servidor: Servidor web

HTTP: utiliza TCP para garantir que os pacotes são entregues

```
Como funciona?

#1: Cliente cria socket TCP
#2: O SO liga socket cliente ao socket servidor (port 80)
#3: Servidor aceita pedido
#4: Troca de mensagens
#5: Ligação TCP é fechada
```

### Pedido HTTP

Enter: \r\n

1. Linha de pedido: método [_] url [_] versão [_] enter
2. Headers
3. Corpo da mensagem

### Resposta HTTP

Muito semelhante


## Ligações 

1. Não persistentes
2. Persistentes

RTT: Round trip time -> Tempo a ir para o destino e voltar

### Não persistente:
Tempo total: (2RTT + tempo de transmissão) * num_objetos
Problema: Mais lento

### Persistente:
Tempo total: RTT + (RTT + tempo de transmissão) * num_objetos
Problema: Muito sockets abertos -> consume muita memória

## HTTP é stateless
O servidor não guarda nenhuma informação
> Mais simples

Contudo, existe maneira de esconder o staless
> COOKEIESSSSSSS (servem para manter o estado)
















