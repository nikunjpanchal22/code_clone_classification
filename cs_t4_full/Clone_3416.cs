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
    var winScenarios = new[] {new {Player = Input.Paper, Computer = Input.Rock},
                        new {Player = Input.Rock, Computer = Input.Scissors},
                        new {Player = Input.Scissors, Computer = Input.Paper}};

    return winScenarios.Any(s => s.Player == userInput && s.Computer == computer) 
           ? Result.Win
           : userInput == computer
             ? Result.Draw
             : Result.Lose;
}


