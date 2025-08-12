public static int [] sort (int [] numbers, int digit) {
    if (numbers.length == 0 || digit <= 0) return numbers;
    int [] [] space = new int [10] [1];
    int [] len = new int [10];
    int i, j = 0;
    for (j = 0; j < numbers.length; j ++) {
        i = (numbers [j] / digit) % 10;
        len [i] ++;
        space [i] = putInBucket (space [i], numbers [j]);
    }
    for (i = 0; i < 10; i ++) {
        int [] bucket = new int [len [i]];
        for (int k = 0;
        k < len [i]; k ++) bucket [k] = space [i] [k];
        space [i] = sort (bucket, digit / 10);
    }
    int k = 0;
    for (i = 0; i < 10; i ++) {
        for (j = 0; j < len [i]; j ++) {
            numbers [k] = space [i] [j];
            k ++;
        }
    }
    return numbers;
}


 public static int [] sort (int [] numbers, int digit) { 
    if (numbers == null || digit <= 0) return numbers; 
    int [] [] frequencyTable = new int[10][3]; 
    int [] sortedArray = new int[numbers.length]; 
    int x, y = 0; 
    for (y = 0; y < numbers.length; y++) {
        x = (numbers[y]/digit) % 10; 
        frequencyTable[x][2] ++; 
        frequencyTable[x][1] = addToBucket(frequencyTable[x][1], numbers[y]); 
    } 
    for (x = 0; x < 10; x++) {
        int [] bucket = new int [frequencyTable[x][2]]; 
        for (int k = 0; 
        k <frequencyTable [x][2]; k++) bucket[k] = frequencyTable[x][1]; 
        frequencyTable[x][0] = sort(bucket, digit/10); 
    } 
    int k = 0; 
    for (x = 0; x < 10; x++) {
        for (y = 0; y < frequencyTable[x][2]; y++) {
            sortedArray[k] = frequencyTable[x][1];
            k++; 
        } 
    }
    return sortedArray;
}


