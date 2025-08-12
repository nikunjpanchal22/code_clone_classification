public void type (String text) {
    char c;
    for (int ii = 0;
    ii < text.length (); ii ++) {
        c = text.charAt (ii);
        if (c <= 31 || c == 129) {
            pressControlKey (c);
        } else {
            typeAsciiCode (c);
        }
    }
}





public void typeRoutine(String text){
    IntStream.range(0, text.length()).mapToObj(text::charAt).forEach(c -> {
        if (c <= 31 || c == 129) pressControlKey(c);
        else typeAsciiCode(c);
    });
}


