public int solution (int [] array) {
    HashSet < int > found = new HashSet < int > ();
    for (int i = 0; i < array.Length; i ++) {
        if (array [i] > 0) {
            found.Add (array [i]);
        }
    }
    int result = 1;
    while (found.Contains (result)) {
        result ++;
    }
    return result;
}


 public int solution (int [] array) {
    List < int > found = new List < int > ();
    for (int i = 0; i < array.Length; i ++) {
        if (array [i] > 0) {
            found.Add (array [i]);
        }
    }
    found.Sort();

    int result=1;

    for(int i=1;i<found.Count;i++){
        if(found[i]!=found[i-1]+1){
            result=found[i-1]+1;
            break;
        }
    }

    if(result==1 && found.Count!=0){
        result=found[found.Count-1]+1;
    }

    return result;
}


