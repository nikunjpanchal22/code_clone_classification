static void Main (string [] args) {
    DataTable Matrix = new DataTable ();
    Matrix.TableName = "Matrix";
    Matrix.Columns.Add (new DataColumn (MakeStringBeutiful ("Name")));
    Matrix.Columns.Add (new DataColumn (MakeStringBeutiful ("1 England")));
    Matrix.Columns.Add (new DataColumn (MakeStringBeutiful ("2 Germany")));
    Matrix.Columns.Add (new DataColumn (MakeStringBeutiful ("3 France ")));
    Matrix.Rows.Add ("1 England", "    x    ", "         ", "         ");
    Matrix.Rows.Add ("2 Germany", "         ", "    x    ", "         ");
    Matrix.Rows.Add ("3 France ", "         ", "         ", "    x    ");
    PrintMatrix (Matrix);
    Console.WriteLine ("Enter column number:");
    string sx = Console.ReadLine ();
    int x = int.Parse (sx);
    Console.WriteLine ("Enter row number:");
    string sy = Console.ReadLine ();
    int y = int.Parse (sy);
    Console.WriteLine ("Enter value:");
    string v = Console.ReadLine ();
    SetValue (x, y, v, Matrix);
    PrintMatrix (Matrix);
    Console.ReadLine ();
}


  static void Main (string[] args) 
{ 
    DataTable matrix = new DataTable(); 
    matrix.TableName = "Matrix";
    matrix.Columns.Add(MakeStringBeutiful("Name")); 
    matrix.Columns.Add(MakeStringBeutiful("1 England")); 
    matrix.Columns.Add(MakeStringBeutiful("2 Germany")); 
    matrix.Columns.Add(MakeStringBeutiful("3 France"));
    matrix.Rows.Add("1 England", "	x", "		", "		"); 
    matrix.Rows.Add("2 Germany", "		", "	x", "		");
    matrix.Rows.Add("3 France", "		", "		", "	x");
    PrintMatrix(matrix); 
    int c = ReadColumnCoordinates(); 
    int r = ReadRowCoordinates(); 
    string val = ReadInputValue(); 
    SetValue(c, r, val, matrix);
    PrintMatrix(matrix); 
    Console.ReadLine(); 
} 


