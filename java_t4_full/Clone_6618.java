public static String translateToEnglish (String phrase) {
    if (phrase == null) {
        return null;
    }
    String finished = phrase.replace ('4', 'a').replace ('1', 'l').replace ('2', 'z').replace ('5', 's').replace ('8', 'b').replace ('0', 'o').replace ('7', 't').replace ("|_|", "u").replace ("3", "e");
    finished = finished.replace (" e ", " 3 ");
    if (finished.startsWith ("e ")) {
        finished = "3 " + finished.substring (2);
    }
    if (finished.endsWith (" e")) {
        finished = finished.substring (0, finished.length () - 2) + " 3";
    }
    return finished;
}




public static String translateToEnglish(String phrase) {
    char [] arr = phrase.toCharArray();
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == '4') arr[i] = 'a';
        else if(arr[i] == '1') arr[i]='l';
        else if(arr[i] == '2') arr[i]='z';
        else if(arr[i] == '5') arr[i]='s';
        else if(arr[i] == '8') arr[i]='b';
        else if(arr[i] == '0') arr[i]='o';
        else if(arr[i] == '7') arr[i]='t';       
    }
    return new String(arr).replace("|_|", "u").replace("3", "e").replace(" e ", " 3 ");
}


