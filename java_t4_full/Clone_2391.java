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
    	if (Character.isLowerCase (character)) {
        	handleSpecialCharacter (character);
        	typeCharacter (Character.toUpperCase (character));
   		} else if (Character.isUpperCase (character)) {
        	handleSpecialCharacter (character);
        	typeShiftCharacter (character);
    	} else if (Character.isDigit (character)) {
        	handleSpecialCharacter (character);
        	typeCharacter (character);
   		}	
}


