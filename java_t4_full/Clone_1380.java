public static void main (String [] args) {
    String set = new java.util.BitSet () {
        {
            set (1, 100 + 1);
        }
    }
    .toString ();
    System.out.append (set, 1, set.length () - 1);
}


public static void main(String[] args) 
{ 
    BitSet set = new BitSet(); 
    for (int i= 0; i<=100; i++){
        set.set(i); 
    }
    System.out.println(set); 
} 


