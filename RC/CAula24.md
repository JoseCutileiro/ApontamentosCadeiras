# Aula teórica

# Criptografia -> Ligações seguras

1. Chave simétrica
2. Chave pública

## Critografia de chave simétrica

```
Cliente e servidor -> Mesma chave

Problema: Como destribuir a chave?
(este problema desaparece na chave pública)
```

## Criptografia de chave pública
```
Cada comunicador tem uma chave pública
e uma chave privada

1. Há 4 chaves no total
2. Para que isto funcione -> Propriedades

```

# Propriedades: Chaves públicas

+: Publica \
-: Privada

1. Precisamos de chaves para cifrar e decifrar
2. Impossivel chegar à privda com a publica
3. publica antes da privada = privada antes da publica

Nota: \
Publica antes da privada: Garante autenticidade \
Privada antes da publica: Secreto

# Como funciona na pratica?
```
Primeiro chave publica para ter as chave simetrica
Depois uso a chave simetrica sempre
```

## Problemas
nonce: Number used only  once

## HASH

5gb -> sumário -> Poucos bits

## Asinatura digital
Assina unicamente a hash (se não seria muito lento)

## Outro problema:
man in the middle: Dificil de detetar
Podemos confiar na chave pública

## Root of trust -> Permite isto

# Camada de aplicação: Email seguro
So funciona para 1 app

# Camada de tranporte: SSL
TODAS as apps são seguras
Pode surgir ataquesn nos cabeçalhos tcp

# Camda de rede: IPsec
Cobertura total: blanket coverage
é como o VPN 

# Camda de ligação: Wifi
WEP (não é bom mas é um bom exemplo) \
\
Depois de muitos pacotes -> Chegamos à chave \
\
IV Resolve este problema

## Ataque ao WEP

# Segurança operacional
1. Firewalll

## NOTAS:
Exame: é no model 


