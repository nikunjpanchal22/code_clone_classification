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
    for (int i = 1; i * i <= number; i+=2) {
        if (number % i == 0) {
            count += 2;
        }
    }
    if (Math.sqrt(number) * Math.sqrt(number) == number) {
        count--;
    }
    return count;
}


