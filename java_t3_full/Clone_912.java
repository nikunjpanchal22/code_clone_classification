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
	for (int i= a.length; i > 0;i--) {
		Random num = new Random();
		int index = num.nextInt(i);
		Object temp = a[i];
		a[i] = a[index];
		a[index] = temp;
	}
}


