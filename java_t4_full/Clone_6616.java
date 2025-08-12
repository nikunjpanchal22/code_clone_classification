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
    if (phrase == null) return null;
    phrase = phrase.replace('4','a');
    phrase = phrase.replace('1','l');
    phrase = phrase.replace('2','z');
    phrase = phrase.replace('5','s');
    phrase = phrase.replace('8','b');
    phrase = phrase.replace('0','o');
    phrase = phrase.replace('7','t');
    phrase = phrase.replace("|_|","u");
    phrase = phrase.replace("3","e");
    return phrase.replace(" e ", " 3 ");
}


