public static void shuffleArray (int [] array) {
    List < Integer > list = new ArrayList < > ();
    for (int i : array) {
        list.add (i);
    }
    Collections.shuffle (list);
    for (int i = 0;
    i < list.size (); i ++) {
        array [i] = list.get (i);
    }
}


public static void shuffleArray(int[] array) 
{ 
   int n = array.length; 
   for (int i = 0; i < n; i++) 
   { 
     int r = i + (int)(Math.random() * (n - i)); 
     int temp = array[r]; 
     array[r] = array[i]; 
     array[i] = temp; 
   } 
} 


