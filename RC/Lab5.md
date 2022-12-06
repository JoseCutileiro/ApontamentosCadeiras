# Laboratório 5: Firewal/NAT

## Firewall

Aplicação que olha para trafego e toma acoes com o trafego \
que está a correr em consideração. \
iptables -> Faz firewalls e nat \

Exemplo iptables: \
iptables -I INPUT -p tcp -j DROP \

INPUT: Trafego que a máquina está receber, \
se for TCP \
DROP (mandamos para o lixo) \

## IPtables

[Table [Chain [Rule]]] \

Rule: ACCEPT (aceita o trafego) \
	  DROP (manda para o lixo)

### PacketFlow

INPUT: Trafego que entra na máquina \
OUTPUT: Trafego que sai da máquina \
FORWARD: Routers \
PREROUTING: Alterar o routing antes de ir ver a tabela de routing
POSTROUTING: Mudar endereço de origem
*O que é routing: Para onde vou enviar o pacote, \
por onde passam os pacotes*

## NAT

IPV4: 32 bits -> Muito limitante \

Vodafone atribui um IP ao router da casa -> NAT \
IP da NAT é público \
As outras máquinas têm outro IP (IP privado) \
É a NAT que faz a tradução \

E se eu agora quiser expor uma das máquinas privadas?

### Port Forwarding:

"Arranjas um porto que é fixo para uma das máquinas privadas"

## Cenas do lab:

1. iptbles -L INPUT {ou OUTPUT ou outros}
2. iptables -F INPUT {ou OUTUT ou outros}
3. Aceitar ICMP: iptables -I INPUT -p icmp -j ACCEPT
4. REJEITAR TCP: iptables -I INPUT -p tcp -j DROP
5. Port especifico (destiny and source):
	> --dport: destiny port \
	> --sport: sourceport \
	> iptables -I INPUT -p tcp --dport 80 -j ACCEPT
6. Para um IP especifico (-s)


