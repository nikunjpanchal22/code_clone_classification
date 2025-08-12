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
    BitSet set = new BitSet(101); 
    for (int i=1; i<=100; i++){
        set.set(i); 
    }
    System.out.println(set.toString().substring(1, set.toString().length() -1)); 
} 


