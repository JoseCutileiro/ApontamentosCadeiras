#  Apontamentos extra para map 2
```
Tempo - Relativo de espectador para espectador
	Não há relogio global
Clock SKEW: Erro entre relógios
Drift rate - 
	rápido: C(t) > t
	lento: C(t) < t

Como sincronizar relogios?
``` 
# Algoritmo de Cristian:

```
Sincronizacao externa:
	Servidor de tempo geralmente  preciso
	
	Os outros relogios ficam com:
		C(t) = S(t) + RTT/2

		Precisão: +- (RTT/2 - min)
	
		(adaptam-se ao servidor)
```

# Algoritmo de berkeley: 
```
1. Sincronziação distribuida entre as varias maquinas
2. Não precisamos de saber o tempo real mas as maquinas 
devem estar sincronzidas
3. Para tolerar falhas - Ignora outliars

Como funciona?
	1. Servidor MASTER:
		no meu relogio são 3:00
	2. Servidores filhos:
		Lista de valores
		[0,+25,-10]
		(num deles é 3:25, no outro é 2:50, master é 3:00)
	3. mean(lista)
		15/3 ---> 5
	4. Todos acertam para 3:05
```

# NTP ( à partida não interessa)

# Relogios logicos
```
Para muitas aplicações basta que os processos cheguem a um 
acordo quanto à ordem de eventos

"happens-before"

Notação:
	x -> y
	(x é prévio a y)
1) Transitividade 
	a -> b
	b -> c
	a -> c

2) Eventos concorrentes
	Se nem a -> b nem b -> a 
	então não podemos concluir nada ( a || b)
	(crash)

Nota:
	a -> b
	C(a) -> C(b)

Correções de lamport:

P1 0 1 2 3 4 5 6 7 8 (+1)

P2 0 2 4 6 8 10 12 14 16 (+2)

P3 0 3 6 9 12 15 18 21 24 (+3)

evento a, de P1 acontecu em 2
evento b, de P2 aconteceu em 4 e sucede evento a 
evento c, de P1 aconteceu em 3 e sucede evento b

Correção de lamport (4 + 1)
P1 0 1 2 [5] 6 7 8 9 10

P2 0 2 4 6 8 10 12 14 16 (+2)

P3 0 3 6 9 12 15 18 21 24 (+3)

Relogios de lamport: Camada middleware

Em que c1 acontece antes de c2
C2() <- max (c1,c2) + 1
```

# Limitações de lamport

```
Lamport diz:

Se x -> y
então C(x) < C(y)

============
>> MASSSS << 
============

Não diz:

Se C(x) < C(y)
então x -> y

Solução possivel: Vector clock 


```
 


