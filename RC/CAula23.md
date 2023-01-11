# Aula 23: Caracteristicas de redes sem fios

## Revisões aula anterior

```
Redes sem fios: Problemas graves
1. Atenuação
2. Interferencia
3. Propagação multi percurso (várias chegadas do mesmo signal)
4. Problema do terminal escondido (CSNA/CD deixa de funcionar)
```

## Wireless LAN IEEE (CSNA/CA)
**AP**: Acess point \

Nas redes 802.11b -> Dividimos em 14 canais \

O admin do AP escolhe a frequência para o seu AP \
(cuidado com as interferencias)


# Alternativa ao CSMA/CD
```

CA: Colision avoidance

Relembra:
CSMA - Escutar antes de tranmitir (assim não há colisões)

Problema:
Não oiço não há problema -> Mas pode haver
```

# CSMA/CA

Sem CD -> Colsision detectance

1. Canal livre?
- Tranmitir trama

2. Canal ocupado
- Começa random backoff timer
- Transmite quando disparar
- Se não houver ACK -> Repte

+ Técnica adicional => Revervar canal

# Segurança
Motivação: É importante


## O que vamos dar:
1. Ataques mais comuns 
2. Criptografia
3. implementação de segurança na prática

## Segurança da rede:
1. Pensar como um atacante
2. Como nos defende-mos destes ataques
3. Arquiteturas de rede imunes => Muito caro

# Exemplos de ataques
1. Colocar malware nos terminais
```
Malware:
1. Virus: Execução pelo utilzador
2. Worm -> Auto replica (utilizador nao faz nada)
```
2. Deniel of service (DoS)

3. Packet sniffing > Wireshark

4. Endereços falsos (IP spoofing)


