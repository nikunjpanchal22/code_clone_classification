static int [] createArray (int size) {
    int [] result = new int [size];
    int limit = (size + 1) / 2;
    int start = 0, value = 0, idx = 0;
    do {
        for (int i = start;
        i < start + limit && idx < size; ++ i) result [idx ++] = value;
        start += limit;
        limit = (limit + 1) / 2;
        ++ value;
    } while (idx < size);
    return result;
}


 static int[] createArray(int size)
{
    int[] result = new int[size];
    int left = 0;
    int right = size - 1;
    int counter = 0;
    while (left < right)
    {
        result[left] = counter;
        result[right] = counter;
        left++;
        right--;
        counter++;
    }
    if (left == right)
    {
        result[left] = counter;
    }
    return result;
}


