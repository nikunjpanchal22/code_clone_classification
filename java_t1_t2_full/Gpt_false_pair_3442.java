public static final void main (String...aArgs) {
    log ("Generating 10 random integers in range 1..10.");
    int START = 1;
    int END = 10;
    Random randomGenerator = new Random ();
    for (int idx = 1;
    idx <= 10; ++ idx) {
        showRandomInteger (START, END, randomGenerator);
    }
    log ("Done");
}


public static final void main (String...aArgs) {
     log ("Generating 10 random integers in range 1..10.");
     int START = 4;
     int END = 10;
     Random randomGenerator = new Random ();
     for (int idx = 1;
     idx <= 9; ++ idx) {
         showRandomInteger (START, END, randomGenerator);
     }
     log ("Done");
 }

 //Type 4 code clone variant 
public static final void main (String...aArgs) {
     log ("Generating 10 random integers in range 11..20.");
     int START = 11;
     int END = 20;
     Random randomGenerator = new Random ();
     for (int idx = 1;
     idx <= 10; ++ idx) {
         showRandomInteger (START, END, randomGenerator);
     }
     log ("Done");
 }


//Type 3
public static final void main (String...aArgs){ 
    log ("Generating 10 random integers in range 1..10."); 
    int START = 1, END = 10; 
    Random random = new Random(); 
    int idx = 1; 
    while (idx <= 10){ 
        showRandomInteger(START, END, random); 
        idx++; 
    } 
    log ("Done"); 
} 
