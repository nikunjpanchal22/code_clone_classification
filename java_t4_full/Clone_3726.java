public static void main (String [] args) {
    String name = "AnuvratAnuvra";
    char [] arr = name.toCharArray ();
    HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
    for (char val : arr) {
        map.put (val, map.containsKey (val) ? map.get (val) + 1 : 1);
    }
    for (Entry < Character, Integer > entry : map.entrySet ()) {
        if (entry.getValue () > 1) {
            Character key = entry.getKey ();
            Object value = entry.getValue ();
            System.out.println (key + ":" + value);
        }
    }
}




public static void main (String [] args) {
    String name = "MaxHardCore";
    Map<Character,int[]> charFrequency=new HashMap<>();
    
    for(int i=0;i<name.length();i++){
        int[] freqArr=charFrequency.get(name.charAt(i));
        if(freqArr==null){
            freqArr=new int[]{0};
            charFrequency.put(name.charAt(i), freqArr);
        }
        ++freqArr[0];
    }
    
    charFrequency.forEach((k,v)->{
        if(v[0]>1) 
            System.out.println(k+": "+v[0]);
    });
}


