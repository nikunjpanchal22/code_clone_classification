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
   		handleSpecialCharacter(character);
    	boolean isLowerCase = Character.isLowerCase (character);
    	boolean isUpperCase = Character.isUpperCase (character);
    	boolean isDigit = Character.isDigit (character);
    	if (isLowerCase) {
       		typeCharacter (Character.toUpperCase (character));
    	} else if (isUpperCase) {
       		typeShiftCharacter (character);
    	} else if (isDigit) {
       		typeCharacter (character);
   		}
}


