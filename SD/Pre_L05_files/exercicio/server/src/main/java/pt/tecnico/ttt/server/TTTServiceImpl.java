package pt.tecnico.ttt.server;

import io.grpc.stub.StreamObserver;
import pt.tecnico.ttt.*;
// ADDED
import static io.grpc.Status.INVALID_ARGUMENT;

public class TTTServiceImpl extends TTTGrpc.TTTImplBase {

	/** Game implementation. */
	private TTTGame ttt = new TTTGame();

	@Override
	public void currentBoard(CurrentBoardRequest request, StreamObserver<CurrentBoardResponse> responseObserver) {
		// StreamObserver is used to represent the gRPC stream between the server and
		// client in order to send the appropriate responses (or errors, if any occur).

		CurrentBoardResponse response = CurrentBoardResponse.newBuilder().setBoard(ttt.toString()).build();

		// Send a single response through the stream.
		responseObserver.onNext(response);
		// Notify the client that the operation has been completed.
		responseObserver.onCompleted();
	}

	@Override
	public void play(PlayRequest request, StreamObserver<PlayResponse> responseObserver) {
		
		int row = request.getRow();
		int column = request.getColumn();
		int player = request.getPlayer();

		PlayResult ret = ttt.play(row, column, player);

		System.out.printf("Player: %d\n", player);

		if (ret == PlayResult.OUT_OF_BOUNDS){
			responseObserver.onError(INVALID_ARGUMENT.withDescription("Input has to be a valid position").asRuntimeException());
		}
		else{
			// Send a single response through the stream.
			PlayResponse response = PlayResponse.newBuilder().setRet(ret).build();
			responseObserver.onNext(response);
			// Notify the client that the operation has been completed.
			responseObserver.onCompleted();
		}
	}

	@Override
	public void checkWinner(CheckWinnerRequest request, StreamObserver<CheckWinnerResponse> responseObserver) {
		int ret = ttt.checkWinner();
		CheckWinnerResponse response = CheckWinnerResponse.newBuilder().setRet(ret).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void	trocaPlayer(trocaRequest request, StreamObserver<trocaResponse> responseObserver) {
		ttt.switchPlayer();
		trocaResponse res = trocaResponse.newBuilder().build();
		responseObserver.onNext(res);
		responseObserver.onCompleted();
	}
}
