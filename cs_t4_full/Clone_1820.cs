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
    string result = null;
    int firstIndex = attempted.Length; 
    int lastIndex= attempted.Length; 

    for(int i=0; i < attempted.Length && i < correct.Length;i++){
        if(attempted[i] != correct[i]){
            firstIndex = i;
            break;
        }
    }

    for(int i=attempted.Length-1, j=correct.Length-1; i>=0 && j>=0;i--, j--){
        if(attempted[i] != correct[j]){
            lastIndex = i;
            break;
        }
    }
    if(firstIndex == -1 && lastIndex == -1){
        result = attempted;
    }
    else{
        if(firstIndex+lastIndex>attempted.Length){
            lastIndex = attempted.Length - firstIndex;
        }
        if(firstIndex > 0){
            result = attempted.Substring(0, firstIndex);
        }
        result += "[";
        if(lastIndex > -1 && lastIndex + firstIndex < attempted.Length){
            result+=attempted.Substring(firstIndex, attempted.Length - lastIndex-firstIndex);
        } 
        result += "]";
        if(lastIndex>0){
            result += attempted.Substring(attempted.Length-lastIndex, lastIndex);
        }
    }
    Assert.AreEqual(expectedResult, result);

}


