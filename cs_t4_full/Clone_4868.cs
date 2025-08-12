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
    bool win = false, draw = false, lose = false;

    if (userInput == Input.Paper) {
        if (computer == Input.Paper) {
            draw = true;
        }
        else if (computer == Input.Rock) {
            win = true;
        }
        else if (computer == Input.Scissors) {
            lose = true;
        }
        else {
            throw new Exception ("Logic fail.");
        }
    }
    else if (userInput == Input.Rock) {
        if (computer == Input.Paper) {
            lose = true;
        }
        else if (computer == Input.Rock) {
            draw = true;
        }
        else if (computer == Input.Scissors) {
            win = true;
        }
        else {
            throw new Exception ("Logic fail.");
        }
    }
    else if (userInput == Input.Scissors) {
        if (computer == Input.Paper) {
            win = true;
        }
        else if (computer == Input.Rock) {
            lose = true;
        }
        else if (computer == Input.Scissors) {
            draw = true;
        }
        else {
            throw new Exception ("Logic fail.");
        }
    }
    else {
        throw new Exception ("Logic fail.");
    }

    if (win)
        return Result.Win;
    else if (draw)
        return Result.Draw;
    else if (lose)
        return Result.Lose;
    else
        throw new Exception ("Logic fail.");
}


