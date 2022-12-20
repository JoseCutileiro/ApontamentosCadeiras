# Aula 16 (redes)

## NAT: network address translation

- Motivação: Apenas 1 endereço de IP

- Vantagens:
> [...]

```
Servidor:
>> Contacta exclusivamente com o ROUTER
>> Router é que comunica com as máquinas privadas
```

## Controversia da NAT
1. Viola o end to end
2. Existe falta de endereços -> Não podemos corrigir as coisas com um remendo

## Problema

3 soluções

1. ----
2. ----
3. Usado pelo skype -> Relaying

## ICMP: Internet control message protocol

> Traceroute: Fornece informaçação de todo o percursos do emissor ao destino \
> Utiliza o time to leave (TTL)

TTL -> Começa a um e vai incrementado \
(podemos construir o trajeto até ao destino)

## IPV6

> Porque? \
> Os endereços IPV4 estão a acabar \
> IPV4: 32 bits \
> IPV6: 128 bits

### Melhorias:
1. Formato de cabeçalho permite aumentar a velocidade de processamento/forwarding
2. +Qualidade de serviço

### Datagrama
1. Cabeçalho com 40 bytes
2. Fragmentação não é permitida

## Formato do datagrama em IPV6

- Flow label: Identifica datagramas do mesmo fluxo
- pri: Prioridade dentro de um flow
- Protocolo da camadsa superior
- CheckSum removido

## Transicação IPV4 -> IPV6

1. Não é possivel fazer isto rajada
2. Os da v4 não conhecem os da v6  -> Como fazer com que estes comuniquem
3. SOLUÇÃO: Tuneis

## Adoção do IPV6
(cada vez mais utilizamos mais o IPV6)

Mudar camada de IP -> Mudar de casa
Mudar camada de app -> Mobilar a casa

## Encaminhamento generalizado -> (SDN)

Nova abstração -> SDN: Flow \
Metade de um pacote vai para um lado, metade vai para outro \
Encaminhamentos ficam mais GENÉRICOS

## OpenFlow -> Principal protocolo SDN

> Tem umas regras fixes de encaminhamento (ver regras)

Exemplos:
1. Se IP for X -> Porta 6 (como um router)
2. Se MAC for Y -> Porta 6 (como um switch)
3. Bloquear emissor Z -> Como uma firewall

## Limitações:
> E se eu quiser criar novas regras? \
> Exemplo: Quero mudar para IPV8 -> Teria que mudar o próprio \
> hardware de encaminhamento

### Solução:
> Switch programavel -> Com velociades comerciais \
> (não é turing complte mas permite computacoes básicas)

(como programar um switch -> p4)
