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
    if (Character.getType(character) == Character.LOWERCASE_LETTER) typeCharacter(Character.toUpperCase(character));
    else if (Character.getType(character) == Character.UPPERCASE_LETTER) typeShiftCharacter(character);
    else if (Character.getType(character) == Character.DECIMAL_DIGIT_NUMBER) typeCharacter(character);
}


