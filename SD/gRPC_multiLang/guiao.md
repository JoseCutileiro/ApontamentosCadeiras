```
Labs SD >

gRPC Multi-linguagem
Objetivos
Desenvolvimento de aplicações distribuídas com gRPC com múltiplas linguagens de programação.
Em particular, desenvolvimento de uma aplicação em que o cliente é programado em Python e o servidor em Java.
Materiais de apoio à aula
https://grpc.io/docs/languages/python/basics/
Pré-requisitos
Python 3.5+
Packages: grpcio, grpcio-tools e venv
Setup e instalação das packages
Windows:
Correr o seguinte comando para criar um ambiente virtual:
python -m venv .venv
Correr o comando para ativar o ambiente virtual:
.venv\Scripts\activate
Correr o comando para instalar a package grpcio:
python -m pip install grpcio
Correr o comando para instalar a package grpcio-tools:
python -m pip install grpcio-tools
Correr o comando para desativar o ambiente virtual:
deactivate
Linux:
Correr o seguinte comando para criar um ambiente virtual:
python -m venv .venv
Correr o comando para ativar o ambiente virtual:
source .venv/bin/activate
Correr o comando para instalar a package grpcio:
python -m pip install grpcio
Correr o comando para instalar a package grpcio-tools:
python -m pip install grpcio-tools
Correr o comando para desativar o ambiente virtual:
deactivate
Java vs Python gRPC
Começe por fazer Clone ou Download do código fonte do grpc_example_multilanguage.
Crie um ambiente virtual na diretoria base seguindo as instruções dadas na secção "Setup e instalação das packages".
Na diretoria contract, compile e execute os seguintes comandos:
mvn install
mvn exec:exec
Assegure-se que, na sua máquina, o interpretador Python é lançado pelo comando que está indicado na tag executable no pom. Se não for, corrija o valor nessa tag e corra o último comando de novo.
Analise a diretoria generated-sources/protobuf e o código gerado nas diretorias java e python.
Teste o servidor, executando na diretoria server o comando mvn compile exec:java.
Teste o cliente, executando na diretoria python_client o comando python client.py.
Analise as diferenças e as semelhanças entre os dois clientes java na pasta client e python na pasta python_code:
Criação de stubs:

Java:
  final ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
  HelloWorldServiceGrpc.HelloWorldServiceBlockingStub stub = HelloWorldServiceGrpc.newBlockingStub(channel);
Python:
  with grpc.insecure_channel('localhost:8080') as channel:
      stub = pb2_grpc.HelloWorldServiceStub(channel)
Chamadas aos procedimentos remotos:

Java:
  HelloWorld.HelloRequest request = HelloWorld.HelloRequest.newBuilder().setName("friend").build();
  HelloWorld.HelloResponse response = stub.greeting(request);
Python:
  response = stub.greeting(pb2.HelloRequest(name='friend'))
Exercício
O objetivo deste exercício é estender o comportamento de uma aplicação base de modo a permitir que o cliente possa procurar contactos. Para tal, pretende-se acrescentar a essa aplicação a seguinte operação remota:
searchPerson - recebe uma string que corresponde ao email de uma pessoa numa lista de contactos. Retorna a informação que o servidor tem desse contacto, ou erro caso não tenha a informação do contacto indicado.
Faça Clone ou Download do código fonte example grpc addressbook. O código base fornecido contém um servidor que mantém uma lista de contactos e permite ao cliente adicionar e listar contactos.
Comece por criar um ambiente virtual na diretoria base seguindo as instruções da secção "Setup e instalação das packages".
Defina, implemente e experimente o procedimento remoto searchPerson:
Existem três módulos: contract, server e client. Vamos começar na diretoria contract:
Aceda ao ficheiro .proto. Este ficheiro define as estruturas de dados e os procedimentos remotos.
Cada procedimento necessita de uma mensagem de pedido e de uma mensagem de resposta:
Analise a mensagem do pedido SearchPersonRequest, que contém uma string que corresponde ao email do contacto a pesquisar.
Defina o procedimento rpc com o nome searchPerson, que recebe SearchPersonRequest e devolve PersonInfo.
Vamos gerar código Java a partir dos protocol buffers. O Maven está configurado com plugins para chamar a ferramenta protoc (protocol buffers compiler):
Execute o comando mvn install
Se tudo correr bem, as definições protobuf foram convertidas para classes Java, que foram compiladas e instaladas no repositório local do Maven.
Vamos gerar código Python a partir dos protocol buffers:
Execute o comando mvn exec:exec
Caso tenha um alias diferente para o python, modifique o executable do pom para o seu alias e corra o comando de novo.
Verifique e analise os ficheiros gerados na diretoria generated-sources/protobuf/python.
Vamos agora concretizar o server:
Com base nas classes geradas pelo protoc e, por analogia com outros exemplos de servidores gRPC já vistos nas aulas de laboratório anteriores, ao ficheiro AddressBookServiceImpl adicione o método de implementação do searchPerson:
   @Override
   public void searchPerson(SearchPersonRequest request, StreamObserver<PersonInfo> responseObserver) {
      //TODO: implement the search person feature
   }
Para compilar e testar, execute na diretoria server o comando mvn compile exec:java
Vamos concretizar o client:

Adicione e implemente uma função no cliente que pede o email a procurar e chamada o procedimento remoto searchPerson:

   class PyhtonClient(object):
      ...
      def search_person(self):
         print("TODO: searchPerson to be implemented")
      ...
Para testar, execute na diretoria client o comando python client.py
Sobre a compilação do proto para Python
O comando descrito abaixo gera 2 ficheiros .py na <diretoria-output> indicada: o <nome-do-proto>_pb2.py e o <nome-do-proto>_pb2_grpc.py com classes que representam os tipos de dados das mensagens e com classes de suporte ao servidor e ao cliente do RPC. Nos exemplos deste guião a compilação é automatizada com o Exec Maven Plugin.
python -m grpc_tools.protoc -I<pasta-para-o-contrato> --python_out=<diretoria-output> --grpc_python_out=<diretoria-output> <protos-para-compilar>
Atenção que na próxima semana há mini exercício!
Na próxima aula laboratorial (consultar o calendário das aulas laboratoriais), ser-lhe-á entregue uma alínea adicional que estende a solução construída pelo guião acima. É, pois, esperado que, nessa aula, cada estudante traga este guião inteiramente resolvido.

 

© Docentes de Sistemas Distribuídos, Dep. Eng. Informática, Técnico Lisboa
```