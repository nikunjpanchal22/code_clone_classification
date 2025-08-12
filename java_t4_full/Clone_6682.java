private void type (char character) {
    handleSpecialCharacter (character);
    if (Character.isLowerCase (character)) {
        typeCharacter (Character.toUpperCase (character));
    }
    if (Character.isUpperCase (character)) {
        typeShiftCharacter (character);
    }
    if (Character.isDigit (character)) {
        typeCharacter (character);
    }
}





private void type(char character) {
    handleSpecialCharacter(character);
    boolean isLower = Character.isLowerCase(character);
    boolean isUpper = Character.isUpperCase(character);
    boolean isDigit = Character.isDigit(character);

    if (isLower) { typeCharacter(Character.toUpperCase(character)); }
    else if (isUpper) { typeShiftCharacter(character); }
    else if (isDigit) { typeCharacter(character); }
}


