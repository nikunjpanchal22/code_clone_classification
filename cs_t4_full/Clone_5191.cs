static void Main (string [] args) {
    List < string > names = new List < string > () {"Sam", "John", "Bob", "Adam", "Kelly", "Nolan", "Carl", "Tim", "Tom", "David"};
    for (int i = 0; i < names.Count; i ++) {
        if (i % 4 == 0 && i > 0)
            Console.WriteLine ();
        Console.Write (names [i] + "\t");
    }
    Console.ReadLine ();
}


 static void Main (string[] args) 
{
    List<string> names = new List<string>() { "Sam", "John", "Bob", "Adam", "Kelly", "Nolan", "Carl", "Tim", "Tom", "David" };
    intTabStart = 0;
    intTabEnd = 4;
    while(intTabStart < names.Count)
    {
        Console.WriteLine(names[intTabStart] + "\t" + names[intTabStart+1] + "\t" + names[intTabStart+2] + "\t" + names[intTabStart+3] + "\t");
        intTabStart += 4;
        intTabEnd += 4;
    }   
    Console.ReadLine();
}


