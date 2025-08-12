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
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('4', 'a');
    map.put('1', 'l');
    map.put('2', 'z');
    map.put('5', 's');
    map.put('8', 'b');
    map.put('0', 'o');
    map.put('7', 't');

    StringBuilder output = new StringBuilder();
    for (int i = 0; i < phrase.length(); i++) {
        output.append(map.get(phrase.charAt(i)));
    }

    return output.toString().replace("|_|", "u").replace("3", "e").replace("^e ", "3 ").replace(" e$", " 3");
}


