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
    if (isSpecialChar (character)) {
        specialCharacterHandler (character);
    } 
    else if (isLowerCaseCharacter (character)) {
        typeUpperCase (Character.toUpperCase (character));
    }
    else if (isUppperCaseCharacter (character)) {
        typeShiftCharacter (character);
    }
    else if (isNumberCharacter (character)) {
        typeNumberCharacter (character);
    }
}


