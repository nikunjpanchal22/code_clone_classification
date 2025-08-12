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
    object[] values = Enumerable.Range(0,Size)
        .Select(i => i % 3 == 0 ? (object)null : i % 3 == 1 ? "" : (object)1).ToArray();

    FindSumWithIsThenCast(values);
    FindSumWithAsThenHasThenValue(values);
    FindSumWithAsThenHasThenCast(values);
    FindSumWithManualAs(values);
    FindSumWithAsThenManualHasThenValue(values);
    Console.ReadLine();
}


