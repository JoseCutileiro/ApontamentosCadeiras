# Aula 2: Redes de computadores

```
Aula de hoje:

Visão da "floresta"
Principais componentes 

Sumário:
O que é a internet
O que é um protocol
Estrutura da rede 
1. Edge (borda)
2. Core (núcleo)

```

Advice: Ver livros da cadeira
1. Kurose&Rosss
2. systemsapproach.org

Relembrar: \
BestEffort -> Tentar o melhor

## O que é a internet
Uma rede de redes. Vários dispositivos \
ligados entre si. \
Ligações físicas: \
- Fibra, cobre , ...
Encaminhadores:  \
- Routers e switches

Interface de programação: Socket

### [API] Socket: 
Abstração de comunicação
Facilita a comunicação

## O que é um protocolo
```
Exemplo: 
1. Protocolo Humano 

2. Protocolo HTTP

>> Pedido de ligação
>> Aceita / Rejeita
>> Pronto para comunicar
```
Um protocolo define: 
1. Formato e ordem das mensagens
2. Objetivo das mensagens
3. Ações a fazer após mensagem

### Redes na edge:
Sistemas terminais: Clientes e servidores
Redes de acesso (com e sem  fios)

### Rede core:
Routers

## Rede de acesso:
Objetivo: quero-me ligar da Edge para o router \
como fazer essa ligação \

Redes de acesso residenciais
1. ADSL
2. Cabo
3. Fibra ótica

Redes de acesso institucionais
1. Ethernet (com fios)
2. Wifi (sem fios)

Rede movel
1. 3G
2. 4G
3. [...]

### Distinguir redes de acesso:
1. Qual é a largura de banda?
2. É partilhada ou dedicada?

## ADSL: 
Gerado pela rede móvel
É bom porque as infraestruturas já existiam previamente
Modem: Passar de ondas para bits
Como é que funciona o caminho:
1. Computador conectado a um modem
2. Modem conectado ao splitter
(splitter: Fazer split das frequências)
3. DSLAM: Com as novas frequências passar para a rede telefónica ou não

> Esta ligação é por default dedicada \
> ou seja é minha. \
> Largura de banda (média): \
> 100Mbits/s

### Redes de cabo (HFC):
> É mais robusto e tem um \
> isolamento melhor \
> Este cabo é melhor que o ADSL por default. \
> Estaligação é partilhada. \
> As taxas de tranferências são superiores a 100Mbits/s

### Fibra ótica:
Um cabo ainda melhor:
1. Mais resistente a noise
2. Maior largura de banda
3. Mais resistente
4. Maior distância
5. Maior fiabilidade

> Pode ser partilhada e dedicada \
> Taxas de tranferência de Gbits/s

Switch: escala mal mas é fácil de montar \
Router: escala bem mas é lixado de configurar

> Nota importante: \
> Ponto de acesso sem fio != Router

### Pacotes:
1. Cada pacote é autónomo
2. Um pacote é composto por: Dados e Metadados (Destino)
3. Não há reserva de caminhos
4. Não existe um estado na rede: Não era possivel escalar (evitar gastar memória)

> Analogia: \
> Pacote  carta de correio

