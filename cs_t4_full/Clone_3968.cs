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
    StringBuilder sb = new StringBuilder();
    for(int i=1;i<=sideLength;i++) {
        sb.Append(new string('*', i)).Append(new string('#', sideLength-i)).Append('\n');
    }
    Console.WriteLine(sb.ToString());
}


