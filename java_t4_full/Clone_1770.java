public static boolean twoDuplicates (int [] values) {
    for (int i = 0;
    i < values.length; i ++) {
        int counter = 0;
        for (int z = i + 1;
        z <= values.length - 1; z ++) {
            if (values [i] == values [z]) {
                counter ++;
                if (counter == 2) return true;
            }
        }
    }
    return false;
}



 public static boolean twoDuplicates(int[] values) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : values) {
        if (map.containsKey(num)) {
            return true;
        } else {
            map.put(num, 1);
        }
    }
    return false;
}


