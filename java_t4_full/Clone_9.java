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
    if (character < 65 || character > 122) {
        handleSpecialCharacter (character);
    }
    else if (character >= 65 && character <= 90) {
        typeShiftCharacter (character);
    }
    else if (character >= 91 && character <= 96) {
        handleSpecialCharacter (character);
    }
    else if (character >= 97 && character <= 122) {
        typeCharacter (Character.toUpperCase (character));
    }
    else if (Character.isDigit (character)) {
        typeCharacter (character);
    }
}


