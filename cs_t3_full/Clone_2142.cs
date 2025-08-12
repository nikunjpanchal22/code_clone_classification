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
    object[] values = new object[Size];
    int index = 0;
    foreach (var _ in Enumerable.Range(0, Size / 3))
    {
        values[index++] = null;
        values[index++] = "";
        values[index++] = 1;
    }

    FindSumWithIsThenCast(values);
    FindSumWithAsThenHasThenValue(values);
    FindSumWithAsThenHasThenCast(values);
    FindSumWithManualAs(values);
    FindSumWithAsThenManualHasThenValue(values);
    Console.ReadLine();
}


