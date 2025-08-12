static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String text) {
    List<Character> charList = new ArrayList<>();
    for(char c : text.toCharArray()){
        charList.add(c);
    }
    StringBuilder output = new StringBuilder(text.length());
    while(charList.size()!=0){
        int randPicker = (int)(Math.random()*charList.size());
        output.append(charList.remove(randPicker));
    }
    return output.toString();
}


