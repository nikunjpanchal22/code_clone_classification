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


 public static string Generate () {
    int pwdLength = RANDOM.nextInt (Minimum, Maximum);
    StringBuilder pwdBuffer = new StringBuilder (Maximum);
    char lastCharacter = '\n';
    for (int i = 0; i < pwdLength; i++) {
        char nextCharacter;
        if (RepeatCharacters) {
            nextCharacter = GetRandomCharacter();
        }
        else {
            do {
                nextCharacter = GetRandomCharacter();
            } while (nextCharacter == lastCharacter || pwdBuffer.indexOf(nextCharacter) != -1);
        }
        if (Exclusions != null) {
            while (Exclusions.indexOf(nextCharacter) != -1) {
                nextCharacter = GetRandomCharacter();
            }
        }
        pwdBuffer.append(nextCharacter);
        lastCharacter = nextCharacter;
    }
    return pwdBuffer.toString();
}


