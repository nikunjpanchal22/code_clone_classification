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


 public int solution(int[] array) {
    Array.Sort(array);
    int result = 1;
    for (int i = 0; i < array.Length; i++) {
        int num = array[i];
        if (num > 0) {
            for (int j = num; j > 0; j--) {
                if (j != result) {
                    result = j;
                }
            }
            result++;
        }
    }
    return result;

}


