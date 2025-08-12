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





static void Main(string[] args)
{
    var values = new object[Size];
    Parallel.For(0, Size / 3, i => 
    {
        values[i * 3 + 0] = null;
        values[i * 3 + 1] = "";
        values[i * 3 + 2] = 1;
    });

    FindSumWithIsThenCast(values);
    FindSumWithAsThenHasThenValue(values);
    FindSumWithAsThenHasThenCast(values);
    FindSumWithManualAs(values);
    FindSumWithAsThenManualHasThenValue(values);
    Console.ReadLine();
}


