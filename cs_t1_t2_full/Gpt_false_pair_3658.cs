static void Main (string [] args) {
    object [] values = new object [Size];
    for (int i = 0; i < Size - 2; i += 3) {
        values [i] = null;
        values [i + 1] = "";
        values [i + 2] = 1;
    }
    FindSumWithIsThenCast (values);
    FindSumWithAsThenHasThenValue (values);
    FindSumWithAsThenHasThenCast (values);
    FindSumWithManualAs (values);
    FindSumWithAsThenManualHasThenValue (values);
    Console.ReadLine ();
}


static void Main (string [] args) {
    object [] values = new object [Size];
    for (int i = 0; i < Size - 4; i += 5) {
        values [i] = null;
        values [i + 1] = 0;
        values [i + 2] = "";
        values [i + 3] = false;
        values [i + 4] = 1;
    }
    FindSumWithIsThenCast (values);
    FindSumWithAsThenHasThenValue (values);
    FindSumWithAsThenHasThenCast (values);
    FindSumWithManualAs (values);
    FindSumWithAsThenManualHasThenValue (values);
    Console.ReadLine ();
}
