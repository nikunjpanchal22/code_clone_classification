public static int LevenshteinDistance (string source, string target) {
    if (source == target)
        return 0;
    if (source.Length == 0)
        return target.Length;
    if (target.Length == 0)
        return source.Length;
    int [] v0 = new int [target.Length + 1];
    int [] v1 = new int [target.Length + 1];
    for (int i = 0; i < v0.Length; i ++)
        v0 [i] = i;
    for (int i = 0; i < source.Length; i ++) {
        v1 [0] = i + 1;
        for (int j = 0; j < target.Length; j ++) {
            var cost = (source [i] == target [j]) ? 0 : 1;
            v1 [j + 1] = Math.Min (v1 [j] + 1, Math.Min (v0 [j + 1] + 1, v0 [j] + cost));
        }
        for (int j = 0; j < v0.Length; j ++)
            v0 [j] = v1 [j];
    }
    return v1 [target.Length];
}


public static int LevenshteinDistance (String source, String target) {
    if (source == target)
        return 0;
    if (source.Length == 0)
        return target.Length;
    if (target.Length == 0)
        return source.Length;
    int[] v0 = new int[target.Length + 1];
    int[] v1 = new int[target.Length + 1];
    for (int i = 0; i < v0.Length; i++)
        v0[i] = i;
    for (int i = 0; i < source.Length; i++) {
        v1[0] = i + 1;
        for (int j = 0; j < target.Length; j++) {
            int cost = (source[i] == target[j]) ? 0 : 1;
            v1[j + 1] = Math.Min(Math.Min(v1[j] + 1, v0[j + 1] + 1), v0[j] + cost);
        }
        for (int j = 0; j < v0.Length; j++)
            v0[j] = v1[j];
    }
    return v1[target.Length];
}
