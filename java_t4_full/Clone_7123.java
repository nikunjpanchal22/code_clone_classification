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
    if (!handleSpecialCharacter(character)) {
        typeCharacter(Character.isDigit(character) ? character : Character.toUpperCase(character));
        if (Character.isUpperCase(character)) {
            typeShiftCharacter(character);
        }
    }
}


