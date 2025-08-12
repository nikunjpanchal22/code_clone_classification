static void Main (string [] args) {
    List < string > names = new List < string > () {"Sam", "John", "Bob", "Adam", "Kelly", "Nolan", "Carl", "Tim", "Tom", "David"};
    for (int i = 0; i < names.Count; i ++) {
        if (i % 4 == 0 && i > 0)
            Console.WriteLine ();
        Console.Write (names [i] + "\t");
    }
    Console.ReadLine ();
}


 static void Main (string [] args) 
{
    string [] names = {"Sam", "John", "Bob", "Adam", "Kelly", "Nolan", "Carl", "Tim", "Tom", "David"};
    for (int i = 0; i < names.Length; i ++) {
        if (i % 4 == 0 && i > 0)
            Console.WriteLine ();
        Console.Write (names [i] + "\t");
    }
    Console.ReadLine ();
}
