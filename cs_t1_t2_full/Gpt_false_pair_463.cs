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
    String output = "";
    String horzDiv = "   +----+----+----+----+----+----+----+----+----+----+\n";
    String disp;
    int x, y;
    output += "      A    B    C    D    E    F    G    H    I    J    \n" + horzDiv;
    for (y = 0; y < size.Height; ++ y) {
        output += String.Format ("{0} ", y + 1).PadLeft (3);
        for (x = 0; x < size.Width; ++ x) {
            switch (grid [x, y]) {
                case -6:
                    disp = "";
                    break;
                case -5:
                    disp = "#";
                    break;
                case -4:
                    disp = ".";
                    break;
                case -3:
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
