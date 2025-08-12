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
    switch(Character.getType(character)) {
        case Character.LOWERCASE_LETTER:
            typeCharacter(Character.toUpperCase(character));
            break;
        case Character.UPPERCASE_LETTER:
            typeShiftCharacter(character);
            break;
        case Character.DECIMAL_DIGIT_NUMBER:
            typeCharacter(character);
            break;
    }        
}


