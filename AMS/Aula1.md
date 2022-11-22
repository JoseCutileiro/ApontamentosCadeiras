# Aula 1: AMS 

### Apresentação da cadeira:

> Bibliografia: \
> 1. Requirements engineering \
> 2. UML, Metodologias e ferramentas \
> 3. Systems engineering \

> Ferramentas: \
> Archi: Reprodução de diagramas \
> Camunda: BPMN models \
> Entreprise architect: Mais comercial \

```
Sumário: 
SysEng & EngReq
ArchiMate
```

### Intrudução: Sistema

1. O que é que define um sistema?
> Exemplos: \
> Corpo humano \ 
> Ecossistema \
> Sistema solar \

2. O que é que caracteriza um sistema? 
> Identidade: O que identifica o sistema \
> Relação entre os elementos que fazem parte do sistema \

3. Modelo: Representação de um sistema
> Exemplos: \
> Modelos de cosntrução \
> Modelo molecular \
> Modelo de uma base de dados (Modelo EA: Entidade associassão) \
> BPMN (mais à frente) 

```
Em suma:
def: Um sistema é algo que está num dado ambiente 
e seguem um objetivo comum.

Ideia de stakeholder.

'Falado: Ler a constituição da republica portuguesa
passar para UML poderia ser um bom TPC'
```
### Sobre sistemas de informação
É um sistema que tem capacidade de armazenar e \
processar informação. É um grupo de entidades (pessoas e \
máquinas) que trabalham para o mesmo fim.

Conceitos:
1. Sistema em estudo
2. Sistema enabling (interagem com o em estudo)
3. Fronteira de um sistema

Ou seja: \
Um sistema é sempre relativo a um CONCEITO

### Sistemas de sistemas (SoS): 
```
Exemplo: 
Vários sistemas fazem parte de um avião, e o 
avião é um sistema por si só.
```
### O que é que é um modelo? 
> Representação simplificada/abstraída da realidade. \
> Modelo conceptual: \
> É um modelo *não fisico* que descreve um sistema. \
> Modelo fisico: \
> Exemplo: Maquete

### Modelo vc Sistema
```
Exemplo:
Um carro de brincar é um modelo de um carro ou um sistema por si só?

Resposta: Depende

Um modelo é por definição um sistema por si só.

UML:

    1                descreve               *  
Systema --------------------------------- Modelo
    |										^
	|_______________________________________|

```
### Modelo Caixa branca vs Caixa preta

branca: O user normal está a par \
preta: O utilizador normal não entende

### Para que serve modelar?
1. Comunicar sem ambiguidades
2. Resolver problemas

### Linguagem de modelação 

1. Produz um modelo
2. É composta por:
> Sintaxe abstrata / MetaModelo: \
> Quais os conceitos e relações \
> Sintaxe concreta / Notação: \
> Como representar a sintaxe abstrata \
> Semântica: \
> Limitações, restricões de identidade e multiplicidade 
3. Exemplo do modelo EA (Ver papéis)

```
Classificar uma linguagem de modelação:
> Domínio que aborda 
	>> Ex: Base de dados
> Várias perspetivas:
	>> Niveis de abstração
			>>> CIM: 
			>>> PIM: 
			>>> PSM: Plataforma independente
	>> Niveis de perspetiva
			>>> Estática
			>>> Dinâmica
```

### ArchiMate - Introdução

1. Dominio: Arquitetura empresarial
2. Archimate Framework

### Arquitetura empresarial
```
Ideia: Permitir perceber o sistema de uma organização
1. Que tipos de processos é que existem
2. Perceber objetivos
3. Compreender a própria organização (o que faz e para onde vai)

Produz deliverables:
1. Ajudar a definir o estado atual (onde estamos)
2. Estado futuro (para onde queremos ir)
3. Gap Analysis
4. Arquitetura roadmap

Enterprise: Uma ou mais organizações que teem uma
relação entre si. Dentro de uma própria empresa.

AS-IS: Tal como é
processo (como ir de um para o outro): Gapp analysis e RoadMap
TO-BE: Para onde queremos ir 
```
### Método de Enterpprie architecture: ADM
No disciplina vamos focar em 
1. Camada de negócio 
2. Camada da aplicação
3. Camada da tecnologia

Archi: Tudo no geral \
BPMN: Focado na camada de negócio \
UML: Aplicação \
SysML: Tecnologia

Exemplo de motivação: ArchiSurance

### ArchiMate Framework: Full Framework

Elementos:
1. Estutura ativa
2. Estrutura passiva
3. Comportamento

Core Framework
1. Todos os tipos de elementos
2. Só tem as camadas core

> Objetivos: \
> 1. Quais são os conceitos \
> 2. Relação entre os conceitos

### Modelo ArchiMate:

Sujeto + Verbo + Objeto

1. Sujeito: Estrutura ativa
2. Verbo: Comportamento
3. Estrutura passiva
