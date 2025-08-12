public static int [] solution (String S, int [] P, int [] Q) {
    int [] arr = new int [S.length ()];
    for (int i = 0;
    i < S.length (); i ++) {
        switch (S.charAt (i)) {
            case 'A' :
                arr [i] = 1;
                break;
            case 'C' :
                arr [i] = 2;
                break;
            case 'G' :
                arr [i] = 3;
                break;
            case 'T' :
                arr [i] = 4;
                break;
            default :
                break;
        }
    }
    segmentNode root = buildTree (arr, 0, S.length () - 1);
    int [] result = new int [P.length];
    for (int i = 0;
    i < P.length; i ++) {
        result [i] = getMin (root, P [i], Q [i]);
    }
    return result;
}


  public static int[] solution (String S, int[] P, int[] Q) {
    int[] arr = new int[S.length()];

    for (int x = 0; x < S.length(); x ++) {
        if (S.charAt (x) == 'A')
            arr[x] = 1;
        else if (S.charAt (x) == 'C')
            arr[x] = 2;
        else if (S.charAt (x) == 'G')
            arr[x] = 3;
        else if (S.charAt (x) == 'T')
            arr[x] = 4;
    }
    segmentNode root = buildTree(arr, 0, S.length() - 1);
    int[] result = new int[P.length];
    for (int i = 0; i < P.length; i++) {
      result[i] = getMin(root, P[i], Q[i]);
    }
    return result;
}


