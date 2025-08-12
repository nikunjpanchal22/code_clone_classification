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


 public static String shuffle(String text) 
{ 
    char [] arr = text.toCharArray();
    char a;  
        for(int i=0; i<arr.length;i++){

            int randomIndex = (int)(Math.random() * arr.length);
            a = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = a;
        }

      return new String(arr);
}
