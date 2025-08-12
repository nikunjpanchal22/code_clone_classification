public static void main (String [] args) {
    Map < String, Integer > unique = new LinkedHashMap < String, Integer > ();
    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {
        if (unique.get (string) == null) unique.put (string, 1);
        else unique.put (string, unique.get (string) + 1);
    }
    String uniqueString = join (unique.keySet (), ", ");
    List < Integer > value = new ArrayList < Integer > (unique.values ());
    System.out.println ("Output = " + uniqueString);
    System.out.println ("Values = " + value);
}


 public static void main (String [] args) 
{ 
    Map<String, Integer> map = new HashMap<String, Integer>(); 
    for(String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) { 
        if(map.containsKey(s)) 
            map.put(s, map.get(s) + 1); 
        else
            map.put(s, 1); 
    } 
    List<String> uniqueStrings = new ArrayList<String>(map.keySet()); 
    List<Integer> values = new ArrayList<Integer>(map.values()); 
    System.out.println("Output = " + String.join(", ", uniqueStrings)); 
    System.out.println("Values = " + values); 
} 


