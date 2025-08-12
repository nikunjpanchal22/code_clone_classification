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


  private int CountDivisorsOfNumber (int num) {
    int count = 0;
    int i, j;
    for (i=2; i<num; i++) {
        for (j=1; j<i; j++) {
            if (i%j==0)
                count++;
        }
    }
    return count;
}


