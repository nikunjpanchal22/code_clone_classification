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
    set.clear(0,100); 
    set.set(1,101); 
    System.out.println(set.toString().substring(1, set.toString().length() -1)); 
} 


