static void Main (string [] args) {
    int value = 997;
    string [,] arrValues = new string [5, 5];
    for (int i = 0; i < arrValues.GetLength (0); i ++) {
        for (int j = 0; j < arrValues.GetLength (1); j ++) {
            value ++;
            arrValues [i, j] = value.ToString ();
        }
    }
    ArrayPrinter.PrintToConsole (arrValues);
    Console.ReadLine ();
}


public void ExecuteTask () {
    int value = 997;
    string [,] arrValues = new string [5, 5];
    for (int i = 0; i < arrValues.GetLength (0); i ++) {
        for (int j = 0; j < arrValues.GetLength (1); j ++) {
            value += 2;
            arrValues [i, j] = value.ToString ();
        }
    }
    ArrayPrinter.PrintToConsole (arrValues);
    Console.ReadLine ();
}
