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





public void runType(String text){
    for(Character c : text.chars().mapToObj(c -> (char) c).collect(Collectors.toList())){
        if (c <= 31 || c == 129) pressControlKey(c);
        else typeAsciiCode(c);
    }
}


