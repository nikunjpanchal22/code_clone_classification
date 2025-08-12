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
    Action action = handleSpecialCharacter(character);
    switch(action) {
        case UPPER: typeCharacter(Character.toUpperCase(character)); break;
        case SHIFT: typeShiftCharacter(character); break;
        case DIGIT: typeCharacter(character); break;
    }
}


