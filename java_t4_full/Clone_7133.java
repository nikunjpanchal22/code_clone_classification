public static boolean longerTF (boolean [] guess) {
    int variableTrue = 0;
    int variableFalse = 0;
    for (int x = 0;
    x < guess.length; x ++) {
        if (guess [x]) {
            variableTrue ++;
        } else {
            variableFalse ++;
        }
    }
    return variableTrue >= variableFalse;
}




public static boolean longerTF(boolean[] guess){
    return Arrays.stream(guess).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).getOrDefault(true, 0L) >= guess.length / 2.0;
}


