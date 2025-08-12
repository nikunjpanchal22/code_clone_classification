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
    if (userInput == Input.Paper) {
        if (computer == Input.Paper) {
            return Result.Draw;
        }
        else if (computer == Input.Rock) {
            return Result.Win;
        }
        else if (computer == Input.Scissors) {
            return Result.Lose;
        }
    }
    else if (userInput == Input.Rock) {
        if (computer == Input.Paper) {
            return Result.Lose;
        }
        else if (computer == Input.Rock) {
            return Result.Draw;
        }
        else if (computer == Input.Scissors) {
            return Result.Win;
        }
    }
    else if (userInput == Input.Scissors) {
        if (computer == Input.Paper) {
            return Result.Win;
        }
        else if (computer == Input.Rock) {
            return Result.Lose;
        }
        else if (computer == Input.Scissors) {
            return Result.Draw;
        }
    }
    throw new Exception("Logic fail.");
}


