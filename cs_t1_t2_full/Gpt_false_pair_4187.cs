static void Main () {
    object [] values = new object [Size];
    for (int i = 0; i < Size - 2; i += 3) {
        values [i] = null;
        values [i + 1] = "";
        values [i + 2] = 1;
    }
    FindSumWithCast (values);
    FindSumWithAsAndHas (values);
    FindSumWithAsAndIs (values);
    FindSumWithIsThenAs (values);
    FindSumWithIsThenConvert (values);
    FindSumWithLinq (values);
    Console.ReadLine ();
}


static void Main () {
    object [] values = new object [Size];
    for (int i = 0; i < Size - 2; i += 3) {
        values [i] = "";
        values [i + 1] = 1;
        values [i + 2] = null;
    }
    FindSumWithCast (values);
    FindSumWithAsAndHas (values);
    FindSumWithAsAndIs (values);
    FindSumWithIsThenAs (values);
    FindSumWithIsThenConvert (values);
    FindSumWithLinq (values);
    Console.ReadLine ();
}
