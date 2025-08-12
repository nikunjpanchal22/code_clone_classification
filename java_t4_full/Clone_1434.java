private static char findFirstCharacter (String s) {
    HashSet < Character > unique = new LinkedHashSet < > (), seen = new HashSet < > ();
    for (int i = 0;
    i < s.length (); i ++) {
        char c = s.charAt (i);
        if (seen.add (c)) unique.add (c);
        else unique.remove (c);
    }
    return unique.isEmpty () ? '_' : unique.iterator ().next ();
}


 private static Character findFirstCharacter (String s) { 
    LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();
    for (int i=0;i<s.length();i++) 
    {  
         char c = s.charAt(i); 

        if(freq.containsKey(c)){
            freq.put(c,freq.get(c)+1);
        }
        else {
            freq.put(c,1);
        }
    } 
    
     for(char c : freq.keySet()) {
        if(freq.get(c) == 1) {
            return c;
        }
     }

return '_'; 

} 


