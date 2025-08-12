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
    var values = new List<object>();
    for (int i = 0; i < Size-2; i += 3)
    {
        values.Add(null);
        values.Add("");
        values.Add(1);
    }

    FindSumWithIsThenCast(values.ToArray());
    FindSumWithAsThenHasThenValue(values.ToArray());
    FindSumWithAsThenHasThenCast(values.ToArray());
    FindSumWithManualAs(values.ToArray());
    FindSumWithAsThenManualHasThenValue(values.ToArray());
    Console.ReadLine();
}


