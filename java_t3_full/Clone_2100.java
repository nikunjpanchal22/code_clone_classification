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
    if (Character.isLetter (character)) {
        if (Character.isLowerCase (character)) {
            typeUpperCaseCharacter (Character.toUpperCase (character));
        }
        if (Character.isUpperCase (character)) {
            typeShiftCharacter (character);
        }
    }

    if (Character.isDigit (character)) {
        typeCharacter (character);
    }
    
    if (character == '#' || character == '@' || character == '!') {
        specialCharacterHandler(character);
    }
}


