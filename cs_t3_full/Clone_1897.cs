public void DrawSquare (int sideLength) {
    for (int row = 1; row <= sideLength; row ++) {
        for (int col = 1; col <= sideLength; col ++) {
            if (col <= row)
                Console.Write ('*');
            else
                Console.Write ('#');
        }
        Console.WriteLine ();
    }
}


 public void DrawSquare (int sideLength) {
    for (int row = sideLength; row > 0; row--) {
        for (int col = sideLength; col > 0; col--) {
            if (col > sideLength - row + 1)
                Console.Write('#');
            else
                Console.Write('*');
        }
        Console.WriteLine();
    }
}


