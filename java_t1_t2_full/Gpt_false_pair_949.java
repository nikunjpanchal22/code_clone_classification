public static void shuffle (Object [] a) {
    int n = a.length;
    for (int i = 0;
    i < n; i ++) {
        int r = i + (int) (Math.random () * (n - i));
        Object swap = a [r];
        a [r] = a [i];
        a [i] = swap;
    }
}


 public static void shuffle (Object [] a) {
	int N = a.length;
	for (int i = 0; i < N; i++) {
		int r = i + (int) (Math.random() * (N - i));
		Object swap = a[r];
		a[r] = a[i];
		a[i] = swap;
	}
}
