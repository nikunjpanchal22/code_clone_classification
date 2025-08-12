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
    bool[] check = new bool[array.Length];
    int max = 0, result = 1;
    for (int i = 0; i < array.Length; i++) {
        int current = array[i];
        if (current > 0) {
            if (current > max) {
                max = current;
            }
            check[current - 1] = true;
        }
    }
    for (int i = 0; i < max; i++) {
        if (!check[i]) {
            result = i + 1;
            break;
        }
    }
    return result;
}


