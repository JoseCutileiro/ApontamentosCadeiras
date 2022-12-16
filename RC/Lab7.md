# Lab 7

# Parte 1: Antes da aula

## Objetivos:

1. Configurar topologias SDN e mininet
2. Explorar a reactividade e proatividade de regras de fluxo
3. Implementar load balances (numa topologia SDN)

## 2. Exercicios:

### Configurar
> Correr setup.sh \

### Mininet

**SDN**: Software defined network \

**Mininet**: Network emulator that allows to creare a virtual topology \

### Comandos da mininet:
```
nodes: See active nodes in a topology
links: See the active links in a topology
help: List of comands
exit: Sair

Nota: Se a mininet bugar => correr comando >> sudo mn -c <<

----------------------------
sudo ovs-ofctl dump-flows s1

See the flow tables for switch s1
(sending OpenFlow messages)
----------------------------
Generate traffic:

h1 ping h2
----------------------------
```

## Configs:

1. **sudo mn -c**: Mininet mais simples
2. **sudo mn --topo linear,4 --mac --switch ovsk --controller remote**: Mininet Linear

# Parte 2 : Conversa do stor

### Rede tradicional:

Não há distinção entre _data plane_ e _control plane_

### SDN:

Separar planode controlo e plano de dados

## The SDN paradigm:

Objetivos:
1. Centralizar o plano de controlo
2. Redes sãp agora programaveis

### Mininet: Emular topologias de SDN

## Paradigmas SDN:

1. Configuração reativa:
Switches reagem a trafego que não tem uma dada regra \
Perguntam diretamentre ao controlador -> +latência

2. Proativa: Instalar (nós) diretamente as regras

##  Load balancing:

- Processo de distribuir trafego por multiplos servidores
- Para quê? Melhorar tempos de resposta e evitar overload de um unico servidores
- LB alghorithms are widely used in large scale networked infrastructures

## alghorithms load balancing: Round-Robin

