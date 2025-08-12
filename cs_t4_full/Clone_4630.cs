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



private string[] splitString (string stringToSplit) 
{ 
    string[] words = stringToSplit.Split(',');
    List<string> returnValueList = new List<string>();
    string tempString = "";
    bool blockUntilEndQuote = false;
 
    foreach (string word in words) 
    {
        if (word.Contains('"')) 
        {
            if (blockUntilEndQuote == false) 
            {
                blockUntilEndQuote = true;
            } 
            else if (blockUntilEndQuote == true) 
            {
                blockUntilEndQuote = false;
            }
        }
        if (blockUntilEndQuote) 
        {
            tempString = tempString + word + ",";
        } 
        else 
        {
            returnValueList.Add(word);
        }
        if (word.Contains('"') && blockUntilEndQuote == false) 
        {
            returnValueList.Add(tempString);
            tempString = "";
        }
    }
    return returnValueList.ToArray();
}


