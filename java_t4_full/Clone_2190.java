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


 private void type (char character) {
    switch (character) {
        case '#':
        case '@':
        case '!':
            handleSpecialCharacter (character);;
            break;
        case inRange ('a', 'z'):
            typeUpperCaseCharacter (Character.toUpperCase (character));
            break;
        case inRange ('A', 'Z'):
            typeShiftCharacter (character);
            break;
        case inRange ('0','9'):
            typeCharacter (character);
            break;
    }
}


