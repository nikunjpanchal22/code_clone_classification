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
    if (character == '#' || character == '@' || character == '!') {
        specialCharacterHandler(character);
    } 
    else if (character >= 'a' && character <= 'z') {
        typeCharacter (Character.toUpperCase (character));
    }
    else if (character >= 'A' && character <= 'Z') {
        typeShiftCharacter (character);
    }
    else if (character >= '0' && character <= '9') {
        typeCharacter (character);
    }
}


