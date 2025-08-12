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
    StringBuilder pwdBuffer = new StringBuilder();
    pwdBuffer.ensureCapacity(Maximum);
    char lastCharacter = '\n';
    for (int i = 0; i < pwdLength; i++) {
        boolean ok = false;
        char nextCharacter = '\n';
        while (!ok) {
            nextCharacter = GetRandomCharacter();
            ok = true;
            if (!RepeatCharacters && lastCharacter == nextCharacter) {
                ok = false;
            }
            if (ok && Exclusions != null && Exclusions.indexOf(nextCharacter) != -1) {
                ok = false;
            }
            if (ok && !RepeatCharacters) {
                String temp = pwdBuffer.toString();
                int duplicateIndex = temp.indexOf(nextCharacter);
                if (duplicateIndex != -1) {
                    ok = false;
                }
            }
        }
        pwdBuffer.append(nextCharacter);
        lastCharacter = nextCharacter;
    }
    return pwdBuffer.toString();
}


