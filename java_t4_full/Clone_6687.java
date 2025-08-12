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
    typeCharacter(Character.isLowerCase(character) ? Character.toUpperCase(character) : (Character.isDigit(character) ? character : null));
    if (Character.isUpperCase(character)) {
        typeShiftCharacter(character);
    }
}


