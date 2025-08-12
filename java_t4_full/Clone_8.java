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
    int CHAR_A = 65, CHAR_Z = 90, INT_0 = 48, INT_9 = 57;
    int charValue = (int)character;

    if(charValue<CHAR_A || charValue>INT_9){
        handleSpecialCharacter(character);
    }
    else if(charValue>=CHAR_A && charValue<=CHAR_Z){
        typeShiftCharacter(character);
    }
    else if(charValue>=CHAR_A+32 && charValue<=CHAR_Z+32){
        typeCharacter(Character.toUpperCase(character));
    }
    else if(charValue>=INT_0 && charValue<=INT_9){
        typeCharacter(character);
    }
}


