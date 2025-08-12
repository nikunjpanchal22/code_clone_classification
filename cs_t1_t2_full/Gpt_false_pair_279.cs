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


	static void Main (string [] args) {
    DataTable Matrix = new DataTable ();
    Matrix.TableName = "Matrix";
    Matrix.Columns.Add (new DataColumn (CleanString ("Name")));
    Matrix.Columns.Add (new DataColumn (CleanString ("1 England")));
    Matrix.Columns.Add (new DataColumn (CleanString ("2 Germany")));
    Matrix.Columns.Add (new DataColumn (CleanString ("3 France ")));
    Matrix.Rows.Add ("1 England", "    x    ", "         ", "         ");
    Matrix.Rows.Add ("2 Germany", "         ", "    x    ", "         ");
    Matrix.Rows.Add ("3 France ", "         ", "         ", "    x    ");
    ShowMatrix (Matrix);
    Console.WriteLine ("Enter column number:");
    string sx = Console.ReadLine ();
    int x = int.Parse (sx);
    Console.WriteLine ("Enter row number:");
    string sy = Console.ReadLine ();
    int y = int.Parse (sy);
    Console.WriteLine ("Enter value:");
    string v = Console.ReadLine ();
    ChangeValue (x, y, v, Matrix);
    ShowMatrix (Matrix);
    Console.ReadLine ();
}
