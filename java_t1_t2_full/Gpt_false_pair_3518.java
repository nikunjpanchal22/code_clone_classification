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


private void type (int code) {
    handleSpecialCharacter (code);
    if (Character.isLowerCase (code)) {
        typeCharacter (Character.toUpperCase (code));
    }
    if (Character.isUpperCase (code)) {
        typeShiftCharacter (code);
    }
    if (Character.isDigit (code)) {
        typeCharacter (code);
    }
}
