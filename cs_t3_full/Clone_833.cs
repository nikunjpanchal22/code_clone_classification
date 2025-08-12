private static void note () {
    int [] i = new int [1];
    do
        {
            Console.WriteLine ("Please enter test result");
            bool result = int.TryParse (Console.ReadLine (), out i [0]);
            if (! result) {
                Console.WriteLine ("Please enter a number");
                continue;
            }
            if (i [0] == 999) {
                Console.WriteLine ("You entered 999 to stop");
                break;
            } else if (i [0] < 0 || i [0] > 100) {
                Console.WriteLine ("Enter a value between 0 and 100");
            } else if (i [0] >= 90) {
                Console.WriteLine ("note is A");
            } else if (i [0] >= 80) {
                Console.WriteLine ("note is B");
            } else if (i [0] >= 70) {
                Console.WriteLine ("note is C");
            } else if (i [0] >= 60) {
                Console.WriteLine ("note is D");
            } else if (i [0] < 60) {
                Console.WriteLine ("Failure");
            }
            Console.WriteLine ("Your result is:" + i [0]);
        } while (true);
}


 private static void note(){ 
	int [] i = new int[1]; 
	do{ 
		Console.WriteLine("Please enter test result"); 
		int result = Int32.Parse(Console.ReadLine()); 
		if(result == 999){ 
			Console.WriteLine("You have entered 999 to stop"); 
			break; 
		} 
		if(result < 0){ 
			Console.WriteLine("Enter a value between 0 and 100"); 
			continue; 
		} 
		if(result >= 90){ 
			Console.WriteLine("Grade is A"); 
		} 
		else if(result >= 80){ 
			Console.WriteLine("Grade is B"); 
		} 
		else if(result >= 70){ 
			Console.WriteLine("Grade is C"); 
		} 
		else if(result >= 60){ 
			Console.WriteLine("Grade is D"); 
		} 
		else{ 
			Console.WriteLine("Failure"); 
		} 
		Console.WriteLine("Your Result is: " + result); 
	} 
	while(true);
}


