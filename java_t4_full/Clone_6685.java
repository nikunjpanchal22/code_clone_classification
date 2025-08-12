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
    typeCharacter(Character.isLowerCase(character) ? Character.toUpperCase(character) : character);
    typeShiftCharacter(Character.isUpperCase(character) ? character : null);
    typeCharacter(Character.isDigit(character) ? character: null);
}


