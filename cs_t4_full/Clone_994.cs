private string [] splitString (string stringToSplit) {
    char [] characters = stringToSplit.ToCharArray ();
    List < string > returnValueList = new List < string > ();
    string tempString = "";
    bool blockUntilEndQuote = false;
    bool blockUntilEndQuote2 = false;
    int characterCount = 0;
    foreach (char character in characters) {
        characterCount = characterCount + 1;
        if (character == '"' && ! blockUntilEndQuote2) {
            if (blockUntilEndQuote == false) {
                blockUntilEndQuote = true;
            } else if (blockUntilEndQuote == true) {
                blockUntilEndQuote = false;
            }
        }
        if (character == '\'' && ! blockUntilEndQuote) {
            if (blockUntilEndQuote2 == false) {
                blockUntilEndQuote2 = true;
            } else if (blockUntilEndQuote2 == true) {
                blockUntilEndQuote2 = false;
            }
        }
        if (character != ',') {
            tempString = tempString + character;
        } else if (character == ',' && (blockUntilEndQuote == true || blockUntilEndQuote2 == true)) {
            tempString = tempString + character;
        } else {
            returnValueList.Add (tempString);
            tempString = "";
        }
        if (characterCount == characters.Length) {
            returnValueList.Add (tempString);
            tempString = "";
        }
    }
    string [] returnValue = returnValueList.ToArray ();
    return returnValue;
}


 private string[] splitString(string stringToSplit) 
{ 
            List<string> answer = new List<string>(); 
            int tempIndex = 0; 
            int changeIndex = 0; 
            bool inQuotes = false; 

            for(int i = 0; i < stringToSplit.Length; i++) 
            { 
                if(stringToSplit[i] == '"' && !inQuotes) 
                { 
                    inQuotes = !inQuotes; 
                } 

                else if(stringToSplit[i] == '"' && inQuotes) 
                { 
                    inQuotes = !inQuotes; 
                } 

                else if(stringToSplit[i] == ',' && !inQuotes) 
                { 
                    string resString = stringToSplit.Substring(tempIndex, i - tempIndex); 
                    changeIndex += i; 
                    tempIndex = changeIndex + 1; 
                    answer.Add(resString); 
                    continue; 
                } 

                if(i == stringToSplit.Length - 1) 
                { 
                    string resString = stringToSplit.Substring(tempIndex, i - tempIndex + 1); 
                    answer.Add(resString); 
                } 
            }  

            return answer.ToArray(); 
} 


