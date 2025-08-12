static void Main () {
    int i, n;
    Console.WriteLine ("Enter the number of highest elements you want to extract from the array:");
    while (! int.TryParse (Console.ReadLine (), out n)) {
        Console.WriteLine ("Enter the number of highest elements you want to extract from the array:");
    }
    double [] arr = {12.1, 5.9, 2.9, 6.8, 20.5};
    if (n > arr.Length)
        n = arr.Length;
    double [] result = new double [n];
    double max = 0;
    int k;
    for (int j = 0; j < n; j ++) {
        max = arr [0];
        k = 0;
        for (i = 1; i < arr.Length; i ++) {
            if (max < arr [i]) {
                max = arr [i];
                k = i;
            }
        }
        result [j] = max;
        arr [k] = Double.MinValue;
        Console.WriteLine ("Highest numbers: {0}", result [j]);
    }
    Console.ReadKey ();
}


  static void Main () {
    int i, n;
    Console.WriteLine ("Enter the number of highest elements you want to extract from the array:");
    while (! int.TryParse (Console.ReadLine (), out n)) {
        Console.WriteLine ("Enter the number of highest elements you want to extract from the array:");
    }
    double [] arr = {12.1, 5.9, 2.9, 6.8, 20.5};
    if (n > arr.Length)
        n = arr.Length;
    double [] result = new double [n];
    double max;
    
    qsort(arr); 
    
    for (int j = 0; j < n; j ++) {
        max = arr[arr.Length - 1 - j]; 
        result[j] = max;
        Console.WriteLine ("Highest numbers: {0}", result [j]);
    }
    Console.ReadKey ();
}


