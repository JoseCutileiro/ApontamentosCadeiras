# Resumos teóricos ArchiMate

> Nota importante: \
> Estes resumos não são compostos \
> por notação gráfica, para isso podes \ 
> aceder diretamente ao leicmyboxclub

## Enterprise architecture

1. Estado atual 
2. Estado futuro 
3. Gap analysis 
4. Architecture roadmap -> Mapa que guia o estado atual para o estado futuro 

**Organização**: Target system of the architecture

### Artefactos da organização

1. Pessoas
2. Estratégia
3. Processos de negócio
4. Informação de sistemas
5. Suporte informático

> Layers: \
> Camada de estratégia \
> Camada de negócio \
> Camada de aplicação \
> Camada de tecnologia

## Archimate core: 
1. Camada de negocio (BPMN)
2. Camada de aplicação (UML)
3. Camada de tecnologia (SysML)

### Hello world (ArchiMate)

Compra e venda de uma pizza

```
Dois atores:
1. Comprador
2. Vendedor

Estes atores estão 'assign' ao processo 
"comprar e vender uma pizza".

O processo comprar e vender uma pizza 
Realiza o serviço 'Comprar pizza' e este 
serviço SERVE o comprador.
```

## Vista genérica por camadas 

```
1. Infraestrutura técnica realiza os serviços 
da infraestrutura

2. Os serviços da infraestrutura servem os componentes
da aplicação

3. Os componentes da aplicação realizam os serviços da aplicação

4. Os serviços da aplicação servem os processos de negócio

5. Os processos de negocio realizam os serviços de negocio 

6. Os serviços de negocio servem os clientes
```





