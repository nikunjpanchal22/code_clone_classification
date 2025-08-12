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


 Result Play (Input userInput) {
    Input computer = Input.Scissors;
    switch (userInput) {
        case Input.Paper :
            return computer == Input.Paper ? Result.Draw : 
            (computer == Input.Rock ? Result.Win : 
            (computer == Input.Scissors ? Result.Lose : throw new Exception ("Logic fail.")));
        case Input.Rock :
            return computer == Input.Paper ? Result.Lose : 
            (computer == Input.Rock ? Result.Draw : 
            (computer == Input.Scissors ? Result.Win : throw new Exception ("Logic fail.")));
        case Input.Scissors :
            return computer == Input.Paper ? Result.Win : 
            (computer == Input.Rock ? Result.Lose : 
            (computer == Input.Scissors ? Result.Draw : throw new Exception ("Logic fail.")));
        default :
            throw new Exception ("Logic fail.");
    }
}


