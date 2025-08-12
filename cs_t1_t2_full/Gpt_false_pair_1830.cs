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
    for (int i = 1; i < sqRoot; i+=2) {
        if (number % i == 0)
            count += 2;
    }
    if (sqRoot * sqRoot == number)
        count++;
    return count;
}
