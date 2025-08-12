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


 private void type (char character){
    char uppercase = Character.toUpperCase(character);
    char[] specialChars = {'@','#','$','!'};

    for(char special : specialChars){
            if(character == special){
                handleSpecialCharacter(character);
                return;
            }
    }
    if(uppercase == character){
        typeShiftCharacter(character);
    }
    else if(Character.isLowerCase(character)){
        typeCharacter(uppercase);
    }
    else if(Character.isDigit(character)){
        typeCharacter(character);
    }
}


