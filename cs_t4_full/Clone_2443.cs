public override String ToString () {
    String output = "";
    String horzDiv = "   +----+----+----+----+----+----+----+----+----+----+\n";
    String disp;
    int x, y;
    output += "      A    B    C    D    E    F    G    H    I    J    \n" + horzDiv;
    for (y = 0; y < size.Height; ++ y) {
        output += String.Format ("{0} ", y + 1).PadLeft (3);
        for (x = 0; x < size.Width; ++ x) {
            switch (grid [x, y]) {
                case (int) Shot.None :
                    disp = "";
                    break;
                case (int) Shot.Hit :
                    disp = "#";
                    break;
                case (int) Shot.Miss :
                    disp = ".";
                    break;
                case (int) Shot.Unresolved :
                    disp = "?";
                    break;
                default :
                    disp = "!";
                    break;
            }
            output += String.Format ("| {0} ", disp.PadLeft (2));
        }
        output += "|\n" + horzDiv;
    }
    return output;
}




public override String ToString () {
	    StringBuilder output = new StringBuilder();
	    var horzDiv = new String('-', 48);
	    var disp = new Dictionary<int, string> {
		{(int) Shot.None, "" },
		{(int) Shot.Hit, "#" },
		{(int) Shot.Miss, "." },
		{(int) Shot.Unresolved, "?" },
	    };
	    string row;
	    for (var y = 0; y < size.Height; y++) {
		row = $"{y + 1,3}:";
		for (var x = 0; x < size.Width; x++) {
		    row += $"| {disp.ContainsKey(grid[x, y]) ? disp[grid[x, y]] : "!"} ";
		}
		output.AppendLine($"{row}|\n{horzDiv}");
	    }
	    return output.ToString();
}


