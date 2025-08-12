private bool IsOk (string str) {
    char ? last = null;
    var i = 1;
    foreach (var c in str) {
        if (last == c) {
            i ++;
            if (i > 2)
                return false;
        } else {
            i = 1;
        }
        last = c;
    }
    return true;
}


  private bool IsOk (string str) {
        HashSet<char> characters = new HashSet<char>();
        foreach(char c in str)
        {
            if(characters.Contains(c))
            {
                return false;
            }
            else
            {
                characters.Add(c);
            }
        }
        return true;
    }

  private bool IsOk (string str) {
        var charDictionary = new Dictionary<char, int>();
        foreach(char c in str)
        {
            if(!charDictionary.ContainsKey(c))
            {
                charDictionary[c] = 1;
            }
            else
            {
                if(charDictionary[c] == 2)
                    return false;
                else
                    charDictionary[c]++;
            }
        }
        return true;
    }

  private bool IsOk (string str) {
        int numSame = 0; 
        char prev = new char(); 
    
        foreach(char c in str) {
            if(numSame == 0){
                prev = c;
                numSame++;
            } else if(prev == c){
                numSame++;
            } else {
                prev = c;
                numSame = 1;
            }
            if(numSame > 2){
                return false;
            }
    
        }
        return true;
    }

 private bool IsOk (string str) {
        char ? prev = null;
        int count = 0;
        foreach(char current in str) {
            if (prev!=null) {
                if(prev == current) {
                    count ++;
                    if (count >2) {
                        return false;
                    }
                }else {
                    count = 1;
                }
            }
            prev = current;
        }
        return true;
    }

  private bool IsOk (string str) {
        HashSet<char> repeatedChars = new HashSet<char>();
       
        foreach(char c in str){
            if(repeatedChars.Contains(c))
                return false;
            else
                repeatedChars.Add(c);
        }
    
        return true;
    }

  private bool IsOk (string str) {
        bool[] seen = new bool[256];
        int length = 0;
	
        foreach(char c in str ) {
            length++;
            if(seen[c])
	            return false;
            else
                seen[c] = true;
            if(length > 2)
	            return false;
        }
        return true;
    }

 private bool IsOk (string str) {
    int[] letterFrequency = new int[256];
    
    foreach (char c in str) {
        letterFrequency[c]++;
        
        if (letterFrequency[c] > 2) {
            return false;
        }
    }
    
    return true;
}


