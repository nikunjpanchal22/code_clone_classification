static Result Play (Input userInput) {
    Input computer = Input.Scissors;
    switch (userInput) {
        case Input.Paper :
            switch (computer) {
                case Input.Paper :
                    return Result.Draw;
                case Input.Rock :
                    return Result.Win;
                case Input.Scissors :
                    return Result.Lose;
                default :
                    throw new Exception ("Logic fail.");
            }
        case Input.Rock :
            switch (computer) {
                case Input.Paper :
                    return Result.Lose;
                case Input.Rock :
                    return Result.Draw;
                case Input.Scissors :
                    return Result.Win;
                default :
                    throw new Exception ("Logic fail.");
            }
        case Input.Scissors :
            switch (computer) {
                case Input.Paper :
                    return Result.Win;
                case Input.Rock :
                    return Result.Lose;
                case Input.Scissors :
                    return Result.Draw;
                default :
                    throw new Exception ("Logic fail.");
            }
        default :
            throw new Exception ("Logic fail.");
    }
}


 Result Play(Input userInput) {
    Input computer = Input.Scissors;
    int player = userInput.ordinal() + 1;
    int comp = computer.ordinal() + 1;
    int result = comp - player;
    switch (result) {
       case 0:
          return Result.Draw;
       case -1:
       case 2:
          return Result.Win;
       case 1:
       case -2:
          return Result.Lose;
       default:
          throw new Exception("Logic fail.");
    }
}


