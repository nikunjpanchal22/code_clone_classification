[Test] [TestCase ("parralele", "parallel", "par[ralele]")] [TestCase ("personil", "personal", "person[i]l")] [TestCase ("disfuncshunal", "dysfunctional", "d[isfuncshu]nal")] [TestCase ("ato", "auto", "a[]to")] [TestCase ("inactioned", "inaction", "inaction[ed]")] [TestCase ("refraction", "fraction", "[re]fraction")] [TestCase ("adiction", "ad[]diction", "ad[]iction")] public void CompareStringsTest (string attempted, string correct, string expectedResult) {
    int first = - 1, last = - 1;
    string result = null;
    int shorterLength = (attempted.Length < correct.Length ? attempted.Length : correct.Length);
    for (int i = 0; i < shorterLength; i ++) {
        if (correct [i] != attempted [i]) {
            first = i;
            break;
        }
    }
    var a = correct.Reverse ().ToArray ();
    var b = attempted.Reverse ().ToArray ();
    for (int i = 0; i < shorterLength; i ++) {
        if (a [i] != b [i]) {
            last = i;
            break;
        }
    }
    if (first == - 1 && last == - 1)
        result = attempted;
    else {
        var sb = new StringBuilder ();
        if (first == - 1)
            first = shorterLength;
        if (last == - 1)
            last = shorterLength;
        if (first + last > shorterLength)
            last = shorterLength - first;
        if (first > 0)
            sb.Append (attempted.Substring (0, first));
        sb.Append ("[");
        if (last > - 1 && last + first < attempted.Length)
            sb.Append (attempted.Substring (first, attempted.Length - last - first));
        sb.Append ("]");
        if (last > 0)
            sb.Append (attempted.Substring (attempted.Length - last, last));
        result = sb.ToString ();
    }
    Assert.AreEqual (expectedResult, result);
}


 [Test] [TestCase("parralele","parallel","par[ralele]")] [TestCase("personil","personal","person[i]l")] [TestCase("disfuncshunal","dysfunctional","d[isfuncshu]nal")] [TestCase("ato","auto","a[]to")] [TestCase("inactioned","inaction","inaction[ed]")] [TestCase("refraction","fraction","[re]fraction")] [TestCase("adiction","addiction","ad[]diction")]  public void CompareStringsTest(string attempted, string correct, string expectedResult){
    int first = -1;
    int last = -1;
    string result = null;
    int shorterLength = Math.Min(attempted.Length,correct.Length);
    
    for (int i=0; i< shorterLength;i++){
        if (attempted[i] != correct[i]){
              first = i;
              break;
        }
    }

    for (int i = shorterLength-1; i>=0; i--){
        if (attempted[i] != correct[i]){
            last = i;
            break;
        }
    }

    if (first == -1 && last == -1)
        result = attempted;
    else{
        if(first == -1)
            first = shorterLength;
        if(last == -1)
            last = shorterLength;
        if(first + last > shorterLength)
            last  = shorterLength-first;
        if(first>0){
            result = attempted.Substring(0,first);
        }
        result +="[";

        if (last > -1 && (last + first ) < attempted.Length){
            result += attempted.Substring(first, attempted.Length-last-first);
        }
        result += "]";
        if (last >0){
            result += attempted.Substring(attempted.Length-last, last);
        }
    }
    Assert.AreEqual(expectedResult, result);
    
}


