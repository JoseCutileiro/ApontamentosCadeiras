# Aula 2: ArchiMate

```
Relembrar:

Linguagens de modelação: 
1. ArchiMate: Enterprise architecture (EA) - Sistemas organizacionais
2. BPMN: Sistemas organizacionais (Focado em processos)
3. UML: Aplicações informáticos
4. SysUML: Sistemas ciberfisicos com hardware especializado

```

### Archimate

1. Camadas:
> Business \
> App \
> Tec 
```
A camada de baixo serve a camada de cima
```
2. Aspetos:
> Active (sujeito) \
> Behaviour (verbo) \
> Passive (objetos)
```
Relembrar: Classe abstrata
- Não existe instanciação
```

### Elementos

1. Comportamento

2. Estrutura:
   1. Ativa
   2. Passiva

```
Relações comuns:

Ao elemento de estututa ativa atribuimos um certo comportamento
Um elemento de comportamento ativa um outro elemento de comportamento
Um comportamento acede a um objeto (elemento de estrutura passiva)
```

ArchiMate: Não impõe nenhum tipo de diagrama, apesar disso \
existem diagramas recomendados. \
ex: \
Organization: diagrama com viewpoint da camada business.

### No caso do projeto:
1. Layered Viewpoint
> Na prática: \
> considerar apenas duas camadas, business e aplication

### Archi: Relações
> Ver no papel

### Regra da derivação de relações e dependências

```
Instancia a
Instancia b
Instancia c

a está relacionado com b por R(r)
b está relacionado com c por R(s)

Poderá haver uma nova relação que elimina b
A nova relação será a relação mais fraca 
```

Ordem da mais forte para a mais fraca:
1. Inflencia
2. Acesso
3. Servir 
4. Realizar
5. [Não consegui o resto]

### Business Layer

1. Comportamento interno 
> Processo \
> Função \
> Interação

2. Passive element 
> Representação \

3.  Active element
> actor \
> role \
> interface \
> collaboration

### Estrutura ativa
> Business actor: Pode ter algum behavior \
> Business role: O seu behavior depende de um ator \
> Business collaboration: \
> Business interface:

### Elementos de comportamento:
1. Processo: setinha
2. Função: Seta boost
3. Circulo partido: Interação
4. Evento:
5. Serviço: 

