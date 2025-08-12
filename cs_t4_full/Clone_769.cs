public static string Generate () {
    var pwdLength = GetCryptographicRandomNumber (Minimum, Maximum);
    var pwdBuffer = new StringBuilder {Capacity = Maximum};
    char lastCharacter = '\n';
    for (var i = 0; i < pwdLength; i ++) {
        var nextCharacter = GetRandomCharacter ();
        while (nextCharacter == lastCharacter) {
            nextCharacter = GetRandomCharacter ();
        }
        if (false == RepeatCharacters) {
            var temp = pwdBuffer.ToString ();
            var duplicateIndex = temp.IndexOf (nextCharacter);
            while (- 1 != duplicateIndex) {
                nextCharacter = GetRandomCharacter ();
                duplicateIndex = temp.IndexOf (nextCharacter);
            }
        }
        if ((null != Exclusions)) {
            while (- 1 != Exclusions.IndexOf (nextCharacter)) {
                nextCharacter = GetRandomCharacter ();
            }
        }
        pwdBuffer.Append (nextCharacter);
        lastCharacter = nextCharacter;
    }
    return pwdBuffer.ToString ();
}


 public static String Generate() {
    int pwdLength = GetCryptographicRandomNumber(Minimum, Maximum);
    StringBuilder pwdBuffer = new StringBuilder(Maximum);
    Set<Character> usedCharacters = new HashSet<Character>();
    for (int i = 0; i < pwdLength; i++) {
        char nextCharacter;
        if (RepeatCharacters) {
            nextCharacter = GetRandomCharacter();
        }
        else {
            do {
                nextCharacter = GetRandomCharacter();
            } while (usedCharacters.contains(nextCharacter) ||
                     (Exclusions != null && Exclusions.indexOf(nextCharacter) != -1));
            usedCharacters.add(nextCharacter);
        }
        pwdBuffer.append(nextCharacter);
    }
    return pwdBuffer.toString();
}


