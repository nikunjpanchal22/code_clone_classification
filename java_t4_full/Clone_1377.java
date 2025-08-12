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
    BitSet set = new BitSet(100); 
    set.set(1); 
    for (int i=2; i<=100; i++) {
        set.set(i,set.get(i-1)); 
    } 
    System.out.println(set.toString().substring(1, set.toString().length() -1)); 
} 


