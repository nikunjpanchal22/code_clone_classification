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
    List<int> found = new List<int>();
    int result = 1;

    foreach (int num in array)
    {
        if (num > 0){
            found.Add(num);
        }
    }
    found.Sort();
    for (int i = 0; i < found.Count; i++){
        if (found[i] == result){
            result++;
        }
    }
    return result;
}


