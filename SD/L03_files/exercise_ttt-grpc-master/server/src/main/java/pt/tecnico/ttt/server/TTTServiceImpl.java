package pt.tecnico.ttt.server;

import io.grpc.stub.StreamObserver;
import pt.tecnico.ttt.*;

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
		PlayResult ret = ttt.play(row,column,player); 
		PlayResponse response = PlayResponse.newBuilder().setRet(ret).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void checkWinner(CheckWinnerRequest request, StreamObserver<CheckWinnerResponse> responseObserver) {
		int ret = ttt.checkWinner();
		CheckWinnerResponse response = CheckWinnerResponse.newBuilder().setRet(ret).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
