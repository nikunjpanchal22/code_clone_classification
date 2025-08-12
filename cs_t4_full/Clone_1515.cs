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
    if ((userInput == Input.Paper && computer == Input.Paper) || (userInput == Input.Rock && computer == Input.Rock) 
    || (userInput == Input.Scissors && computer == Input.Scissors)) {
        return Result.Draw;
    }
    if ((userInput == Input.Paper && computer == Input.Rock) || (userInput == Input.Rock && computer == Input.Scissors) 
    || (userInput == Input.Scissors && computer == Input.Paper)) {
        return Result.Win;
    }
    if ((userInput == Input.Paper && computer == Input.Scissors) || (userInput == Input.Rock && computer == Input.Paper) 
    || (userInput == Input.Scissors && computer == Input.Rock)) {
        return Result.Lose;
    }
    throw new Exception("Logic fail.");
}


