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
    Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());
    for (int i = 1; i <= array.length + 1; i++) {
        if (!set.contains(i)) return i;
    }
    return -1;
}


