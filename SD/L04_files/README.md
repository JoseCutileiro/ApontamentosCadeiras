# Lab 4

```
Objetivos:
	1) Testing code
	2) Error handle
	3) Practice gRPC

```

# Ponto de partida

```
gRPC solução do ttt da aula anterior 
(para mais info ver L03_files) 
```

# Introdução 

```
Tratamento de erros em gRPC:
https://tecnico-distsys.github.io/04-rpc-error-test/grpc-error/index.html

Testes de integração com Junit:
https://tecnico-distsys.github.io/04-rpc-error-test/junit-it/index.html
```

> 0) Não esquecer "mvn install" para correr o proto (pasta /contract)\
> 1) Deves seguir para a parte seguinte apenas se entendes os conceitos \
> abordados em cima \
> 2) Se queres apenas ver a solução basta CTRL+F "// UPDATE" \
> todas as atualizações serão mostradas

# Error throwing:

```
Em server impl:
	import static io.grpc.Status.INVALID_ARGUMENT;


	 ...
	 ...
	 ...

	 PlayResult result = ttt.play(row, column, player);

	if (result == PlayResult.OUT_OF_BOUNDS){
    		responseObserver.onError(INVALID_ARGUMENT.withDescription("Input has to be a valid position").asRuntimeException());
		}
	else{
    		// Send a single response through the stream.
    		PlayResponse response = PlayResponse.newBuilder().setPlay(result).build();
    		responseObserver.onNext(response);
    		// Notify the client that the operation has been completed.
    		responseObserver.onCompleted();
	}		
```

# Error catching

```
Em TTTClient.java:

=============================================
play_res = null;
...
try{
    play_res =  stub.play(PlayRequest.newBuilder().setRow(row).setColumn(column).setPlayer(player).build()).getPlay();
    if (play_res != PlayResult.SUCCESS) {
        displayResult(play_res);
    }
}
catch (StatusRuntimeException e) {
    System.out.println("Caught exception with description: " + 
        e.getStatus().getDescription());
} 
============================================
```

# Assert tests:

1. assertArrayEquals
2. assertFalse
3. assertNull
4. assertTimeout
 

