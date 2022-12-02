# LAB4: DNS (domain name system)

## Objetivos

1. Queremos uma forma de aceder a um dado site sem ter que decorar o IP original

## Comando dig (pedidos DNS manualmente)

dig -> Cliente DNS normal

> Flags: \
> -t -> soa, a, aaaa, ns, cname, mx \
> soa: admin \
> a: Tenho um nome e quero um IP (IPV4) \
> aaaa: O mesmo para IPV6 \
> ns: Qual é o servidor dns que responde a este tipo de pedidos \
> cname: Canonical name de um servidor (nomes principais) \
> mx: email \
> \
> +trace: Make iterative queries (sem +trace recursivo)

8.8.8.8 : Google DNS server

## Iterative queries: 
DNS client: Geralmente corre nas nossas máquinas \
\
ITERATIVE: é o DNS client que revolve todos os pedidos
0. REQUEST
1. Root DNS server
2. TLD DNS server
3. Authoritative DNS server
4. RECEIVE
\
Recursive: Pedido recursisvo para o Root DNS server


