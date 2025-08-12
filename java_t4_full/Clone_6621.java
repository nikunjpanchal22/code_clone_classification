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
    return phrase.replaceAll("4", "a").replaceAll("1", "l").replaceAll("2", "z").replaceAll("5", "s").replaceAll("8", "b").replaceAll("0", "o").replaceAll("7", "t").replaceAll("\\|_\\|", "u").replaceAll("3", "e").replaceAll("^e ", "3 ").replaceAll(" e$", " 3");
}


