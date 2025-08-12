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
    AtomicInteger count = new AtomicInteger();
    Arrays.stream(guess).forEach(b -> count.addAndGet(b ? 1 : -1));
    return count.get() >= 0;
}


