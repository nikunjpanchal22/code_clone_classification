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


 public static void main(String[] args){
    Map<String, Integer> score = new HashMap<String, Integer>();
    for(String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")){
        if (score.containsKey(s))
            score.put(s, score.get(s) + 1);
        else
            score.put(s, 1);
    }
    String outputString = String.join(", ", score.keySet());
    List<Integer> values = new ArrayList<Integer>(score.values());
    System.out.println("Output = " + outputString);
    System.out.println("Values = " + values);
}


