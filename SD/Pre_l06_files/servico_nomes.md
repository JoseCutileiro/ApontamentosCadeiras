# Servidor de nomes

## Objetivos:

1. Criar um servidor de nomes
2. Publicar e pesquisar serviços gRPC no servidor de nomes

# Intrudução:
```
Neste guião construiremos um servidor de nomes usando a tecnologia gRPC. Este servidor permitirá que processos servidores registem o serviço remoto que oferecem.
Isso permitirá que os processos cliente possam descobrir, quais os endereços (nome DNS, porto) dos servidores que atualmente oferecem um dado serviço. Pode haver mais que um
servidor a oferecer o mesmo serviço remoto (por exemplo, num serviço replicado), sendo que cada servidor pode ser distinguido por um qualificador (por exemplo, 
"primário" e "secundário").
```

# Codigo base: Da primeira entrega do projeto

## Vamos fazer alteraçṍes a esta entrega:

1. .proto --- CrossServer_proto:
```
message RegisterRequest {
  string service = 1;
  string server = 2;
  string address = 3;
}

message RegisterResponse {
  // VOID 
  // EXCEÇÃO: "Not possible to register the server"
}

service DistLedgerCrossServerService {
  rpc propagateState(PropagateStateRequest) returns (PropagateStateResponse);
  rpc register(RegisterRequest) returns (RegisterResponse);
}
```

2. NamingServer.java --- Configurar para estar no port  5001
```
        // receive and print arguments
        System.out.printf("Received %d arguments%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("arg[%d] = %s%n", i, args[i]);
        }

        // check arguments
        if (args.length < 1) {
            System.err.println("Argument(s) missing!");
            System.err.printf("Usage: java %s port%n", ServerMain.class.getName());
            return;
        }

        final int port = Integer.parseInt(args[0]);

        if (port != 5001) {
            System.err.println("[NAMING SERVER] Wrong port inserted, MUST BE 5001");
        }
```

3. Criar classes
```
- ServerEntry
- ServiceEntry
- NamingServer
```

4. Mais serviços e cenas

5. TODO : Imports estão bugados