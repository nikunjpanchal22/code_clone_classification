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



public void DrawSquare(int sideLength) {
    for(int i=1;i<=sideLength;i++) {
        Console.Write(new String('*', i));
        if(i<sideLength) Console.Write(new String('#', sideLength-i));
        Console.WriteLine();
    }
}


