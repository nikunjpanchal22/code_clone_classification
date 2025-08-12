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





static Result Play (Input userInput) {
    Input computer = Input.Scissors;
    Tuple<Input, Input>[] winScenarios = {
        Tuple.Create (Input.Paper, Input.Rock),
        Tuple.Create (Input.Rock, Input.Scissors),
        Tuple.Create (Input.Scissors, Input.Paper)
    };
    return winScenarios.Any(t => t.Item1 == userInput && t.Item2 == computer) 
           ? Result.Win 
           : userInput == computer 
             ? Result.Draw 
             : Result.Lose;
}


