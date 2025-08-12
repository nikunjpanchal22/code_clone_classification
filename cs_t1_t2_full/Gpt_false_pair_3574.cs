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
    var pwdLength = GetCryptographicRandomNumber (Minimum, Maximum);
    var pwdBuffer = new StringBuilder {Capacity = Maximum};
    char lastCharacter = '\n';
    for (var i = 0; i < pwdLength; i ++) {
        var nextCharacter = GetRandomCharacter ();
        while (nextCharacter == lastCharacter) {
            nextCharacter = GetRandomCharacter ();
        }
        if (false == RepeatCharacters) {
            int tempIndex = pwdBuffer.Length;
            var duplicateIndex = pwdBuffer.ToString ().IndexOf (nextCharacter);
            while (- 1 != duplicateIndex) {
                nextCharacter = GetRandomCharacter ();
                duplicateIndex = pwdBuffer.ToString ().IndexOf (nextCharacter, tempIndex);
            }
        }
        if ((null != Exclusions)) {
            while (- 1 != Exclusions.IndexOf (nextCharacter)) {
                int tempIndex = pwdBuffer.Length;
                nextCharacter = GetRandomCharacter ();
            }
        }
        pwdBuffer.Append (nextCharacter);
        lastCharacter = nextCharacter;
    }
    return pwdBuffer.ToString ();
}
