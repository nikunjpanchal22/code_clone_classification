private int CountDivisorsOfNumber (int number) {
    int count = 0;
    int end = (int) Math.Sqrt (number);
    for (int i = 1; i < end; i ++) {
        if (number % i == 0)
            count += 2;
    }
    if (end * end == number)
        count ++;
    return count;
}


  private int CountDivisorsOfNumber (int number) {
    int count = 0;
    int sqRoot =  Math.Sqrt (number);
    int i = 0;
    while (i < sqRoot) {
        if (number % (i+1) == 0)
            count += 2;
        i++;
    }
    if (sqRoot * sqRoot == number)
        count++;
    return count;
}


