# Aula 13: RC

# Revisões

## Routing vs Forwarding:

Como é que vou encaminhar os pacotes?
> **Algoritmo de routing** \
> Determinar rotas através da rede \
> Como preencher as tabelas

### Plano de dados
Função: Encaminhar pacotes \
Ação **local**
> ir a uma tabela e encaminhar pacotes (mais simples)

### Plano de controlo
Função: Como encaminhar pacotes?
> Routing é definido aqui \
Ação **global** \

Duas abordagens
1. Tradicional: Algoritmos implementados nos routers
2. Redes definidas por software (SDN): Implementado em servidores remoto

## Plano de controlo tradicional:

_NOTA_: O plano de dados também corre nos routers

Algoritmo corre nos routers e **TODOS** interagem entre si.

> Djkstra: Corre de 30 em 30 segundos [NO CPU]\
> Distribuição de pacotes: Correm em nano segundos

**Algoritmo Distribuido**: Corre com a comunicação dos vários routers \
O Djkstra corre em todos os routers?

## Plano de controlo logicamente centralizado

### Um controlador remoto que interage com
### agentes locais em **CADA** router
```
>> Routers ficam mais simples
>> Quase que não precisam de CPU
```

Socrative: \

SDN é melhor ou nem por isso?

## Aspetos negativos:
1. Controlador centralizado: Problema de escalabilidade => Como é lento não há muito problema (multiplas replicas de controladores)
2. Controlador centralizado: Se o SDN falha => -resiliencia

## Aspetos positivos:
1. É muito dificil fazer debug de redes tradicionais
2. Temos um visão global da rede => Mais facil perceber o que se passa
3. Redes passam a ser  programaveis (software)
4. Mais simplificado
5. Mais fácil de fazer alterações na rede

> Stor: Plano de dados PROGRAMAVEL (tal como o de controlo) \
> p4.org : Linguagem que permite PROGRAMAR plano de dados

# Plano de dados

Visão simplificada:
```
Um computador com duas caracteristicas especiais
1. Muitas placas de rede
2. Objetivo: Comutar pacotes rapidamente

Funções chave:
	- Correr protocolos de routing (RIP,OSPF,BGP)
```

## Porta de entrada
1. LookUp: Na tabela de encaminhamento
2. O processamento tem que ser à velociade da linha [GARANTIR LINE RATE]
3. CPU dos routers -> Variantes de linux

## Tabela de encaminhamento:
```
Problema de escalabilidade
> Os routers já tem agora as tabelas preenchidas \
> os routers tem uma memória pequena -> Não dá para preencher as \
> tabelas com todos os endereços de IP \
> Solução: Guardas GAMAS de IPS (agregar endereços)
```

### Como agregar IPS (IPV4)

[32 bits] \

/21 -> Os primeiros 21 bits representam a gama do endreço \
	-> Os outros 11 bits são computadores especificos \
	-> 11 bits para IPS ESPECIFICOS

/24 tem menos computadores que /21

Definir intefaces de saída para cada gama

```
Nota: Representação de gamas:
128.16.24.0/24
```
