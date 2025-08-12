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
    String translated = phrase.replace('4','a');
    translated = translated.replace('1','l');
    translated = translated.replace('2','z');
    translated = translated.replace('5','s');
    translated = translated.replace('8','b');
    translated = translated.replace('0','o');
    translated = translated.replace('7','t');
    translated = translated.replace("|_|","u");
    translated = translated.replace("3","e");
    return translated.replace(" e", " 3 ");
}


