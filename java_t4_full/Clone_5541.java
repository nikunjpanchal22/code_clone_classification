public static int [] MaxNumber (String [] arr) {
    int [] Number_arr = new int [11];
    int count = 1;
    int j = 0;
    int k = 0;
    for (int i = 0;
    i < arr.length - 1; i ++) {
        if (arr [i].equals (arr [i + 1])) count ++;
        else {
            Number_arr [j] = count;
            j ++;
            count = 1;
        }
    }
    Number_arr [j] = count;
    return Number_arr;
}




public static int [] MaxNumber (String [] arr) {
    java.util.Map<String, Integer> frequencyMap = new java.util.HashMap<>();
    for(String value : arr){
        frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
    }
    return frequencyMap.values().stream().mapToInt(i->i).toArray();
}


