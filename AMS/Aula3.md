# Aula 3: AMS

## Fundamentos de BPMN 

### Introdução:
- Permite mais detalhe e mais rigor
- Processo de negócio
- Map30: 5/12/2022
- Livro: Business Process Managent

## Processo de negócio:

1. O que é um processo de negócio? 

Sequência de atividades, que recebe um \
conjunto de INPUTS que irá produzir um \
conjunto de OUTPUTS. O output irá ter valor \
para um dado cliente.

```
Exemplo: Técnico

Enquanto alunos
1. Produto inicial 
2. Produto final 
```
2. Exemplos 
```
-- Desenvolvimento de projetos
-- IT dev
```

### Tipos de processos de negócio
1. Management
   > Marketing
   > Recursos humanos
2. Operational/Primary
   > Matéria prima
   > Produto final
3. Suporte
   > Não tem valor diretamente mas são necessário

## BMP

### Business process management

### Business process modeling

> BPMN: Business process modeling notation

## BPMN 2.0

> 'Promovida pela OMG'

O UML e o SysUML também são promovidos pela OMG

> https://www.omg.org/

### BP diagramns

```
Vamos ver:

1. Process diagram
2. Collaboration diagram

===============================

Não vamos ver:
3. Choreography diagram
4. Conversation diagram
```

### BPMN 
1. Evento (Circulo)
2. Tarefa (Retangulo)
3. Fluxo (Setinha)
4. Gateway (Losangulo): Coisas em paralelo
	> Gateway: \
	> XOR: Separação exclusiva(faz uma ou a outra) \
	> AND: Paralell/Fork (faz ambas)

### Exemplo: Simplified insurance claim
```
c -> Check -> XOR -> Notify -> FIM
                         |---> Evaluate -> XOR-> Send -> Receive -> Check completed -> XOR -> Register -> FIM 
                                            ^____________________________________________|
c: Circulo 'Receive claim' 
```

Por resolver:
1. Quem?
2. Onde?
3. Como?
4. Quando?

### WHO
```
Pool: Participante de um processo
	> Sequence flows cannot cross pool boudaries
	> Message flows CAN cross pool boudaries
Lane: Sub-Divisão de um projeto
	> Sequence flows CAN cross pool lanes

Exemplo:
____________________________________
|        |                          |
|cliente |                          |
|________|__________________________|


____________________________________
|        |                          |
|suplier |                          |
|________|__________________________|

Comunicação entre participantes com 'setinhas'


> Descriminar sub pools (lanes)
____________________________________
|        |vendas                    |
|suplier |__________________________|
|        |armazem                   |
|________|__________________________|

```

### Exercicio (o mesmo das reclamações mas com pools)





```