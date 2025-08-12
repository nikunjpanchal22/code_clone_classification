public override String ToString () {
    String output = String.Format ("Target size is {0}\n", Target.Length);
    String horzDiv = "   +----+----+----+----+----+----+----+----+----+----+\n";
    int x, y;
    output += "      A    B    C    D    E    F    G    H    I    J    \n" + horzDiv;
    for (y = 0; y < size.Height; ++ y) {
        output += String.Format ("{0} ", y + 1).PadLeft (3);
        for (x = 0; x < size.Width; ++ x) {
            output += String.Format ("| {0} ", grid [x, y].ToString ().PadLeft (2));
        }
        output += "|\n" + horzDiv;
    }
    return output;
}


  public override String ToString () {
  String output = String.Format ("Target size is {0}\n", Target.Length);
  String horzDiv = "---+---+---+---+---+---+---+---+---+---+\n";
  int x, y;
  output += " A  B  C  D  E  F  G  H  I  J \n" + horzDiv;
  for (y = 0; y < size.Height; ++ y) {
        output += String.Format ("{0} ", y + 1).PadLeft (3);
        for (x = 0; x < size.Width; ++ x) {
            output += String.Format ("|{0}", grid [x, y].ToString ().PadLeft (2));
        }
        output += "|\n" + horzDiv;
    }
    return output;
}
