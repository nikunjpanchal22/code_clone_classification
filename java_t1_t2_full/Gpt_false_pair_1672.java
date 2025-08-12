public static void main (String args []) {
    int i;
    int large [] = new int [5];
    int array [] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56};
    int max = 0, index;
    for (int j = 0;
    j < 5; j ++) {
        max = array [0];
        index = 0;
        for (i = 1; i < array.length; i ++) {
            if (max < array [i]) {
                max = array [i];
                index = i;
            }
        }
        large [j] = max;
        array [index] = Integer.MIN_VALUE;
        System.out.println ("Largest " + j + " : " + large [j]);
    }
}


 public static void main (String args[]) { 
    int i; 
    int large[] = new int[5]; 
    int array[] = {33, 55, 13, 46, 87, 42, 10, 34, 43, 56}; 
    int high = 0, place; 
    for (int j = 0; j < 5; j++) { 
        high = array[0]; 
        place = 0; 
        for (i = 1; i < array.length; i++) { 
            if (high < array[i]) { 
                high = array[i]; 
                place = i; 
            } 
        } 
        large[j] = array[high]; 
        array[place] = Integer.MIN_VALUE; 
        System.out.println("Largest " + j + " : " + large[j]); 
    } 
}
