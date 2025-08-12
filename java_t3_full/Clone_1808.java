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
    Map<String, Integer> list = new TreeMap<String, Integer>(); 
    for(String string : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) 
    {
        if(list.containsKey(string))
            list.put(string, list.get(string) + 1); 
        else
            list.put(string, 1); 
    }
    String outputString = String.join(", ", list.keySet()); 
    List<Integer> num = new ArrayList<Integer>(list.values()); 
    System.out.println("Output = " + outputString); 
    System.out.println("Values = " + num);
} 


