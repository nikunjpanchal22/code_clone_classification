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
    string output;
    for(int i=0; i<sideLength; i++) {
        output = new string('*', i+1) + new string('#', sideLength-i-1);
        Console.WriteLine(output);
    }
}


