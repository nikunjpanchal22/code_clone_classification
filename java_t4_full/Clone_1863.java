public static String shuffle (String text) {
    char [] characters = text.toCharArray ();
    for (int i = 0;
    i < characters.length; i ++) {
        int randomIndex = (int) (Math.random () * characters.length);
        char temp = characters [i];
        characters [i] = characters [randomIndex];
        characters [randomIndex] = temp;
    }
    return new String (characters);
}


 public static String shuffle (String text) 
{ 
    char[] tmp = text.toCharArray(); 
     
    int index; 
    char temp;
     
    Random rand = new Random(); 
    for (int i = tmp.length - 1; i > 0; i--) 
    { 
        index = rand.nextInt(i + 1); 
        temp = tmp[index]; 
        tmp[index] = tmp[i]; 
        tmp[i] = temp; 
    } 
     
    return String.valueOf(tmp); 
} 


