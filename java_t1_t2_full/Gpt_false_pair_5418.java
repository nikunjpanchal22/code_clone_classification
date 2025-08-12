public Void call () {
    gameGUI.indicateDiceRoll (diceRoll);
    int newIndex = getPlayerIndexAfterRoll (diceRoll);
    ScheduledFuture < Void > moveScheduledFuture = move (newIndex);
    if (moveScheduledFuture != null) {
        moveScheduledFuture.get ();
    }
    System.out.println ("change turns");
    swapTurns ();
    System.out.println (isComputerTurn ());
    gameGUI.updateCurrentTurnLabel ();
    if (newIndex == GameBoard.WIN_POINT) {
        boolean restartGame = gameBoard.playAgainOrExit ();
        if (restartGame) {
            Player winner = gameBoard.getCurrentPlayer ();
            gameGUI.updateScore (winner);
            gameGUI.playAgain ();
        } else {
            System.exit (0);
        }
    }
    return null;
}


public Void call () {
    gameGUI.indicateDiceRoll(diceRoll);
    int newIndex = getPlayerIndexAfterRoll(diceRoll);
    ScheduledFuture<Void> moveScheduledFuture = move(newIndex);
    if(moveScheduledFuture != null) {
        moveScheduledFuture.get();
    }
    System.out.println("change turns");
    gameBoard.swapTurns();
    System.out.println(gameBoard.isComputerTurn());
    gameGUI.updateCurrentTurnLabel();
    if(newIndex == GameBoard.WIN_POINT) {
        boolean restartGame = gameBoard.playAgain();
        if(restartGame) {
            Player winner = gameBoard.getCurrentPlayer();
            gameGUI.updateScore(winner);
            gameGUI.restartGame();
        } else {
            System.exit(0);
        }
    }
    return null;
}
