public static int [] front11 (int [] a, int [] b) {
    int alen = (a != null) ? a.length : 0, blen = (b != null) ? b.length : 0;
    if (alen > 0 && blen > 0) {
        return new int [] {a [0], b [0]};
    } else if (alen > 0) {
        return new int [] {a [0]};
    } else if (blen > 0) {
        return new int [] {b [0]};
    } else {
        return new int [0];
    }
}



 

public static int[] front11(int[] a, int[] b) {
            int[] result = new int[0];
            if (a != null && a.length != 0) {
                result = append(result, a[0]);
            }
            if (b != null && b.length != 0) {
                result = append(result, b[0]);
            }
            return result;
        }
        public static int[] append(int[] arr, int element) {
            int[] newArr = Arrays.copyOf(arr, arr.length + 1);
            newArr[arr.length] = element;
            return newArr;
}


