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




private int CountDivisorsOfNumber(int number) {
    int divisors = 0;
    for(int i = 1; i * i <= number; i++) {
        if(number % i != 0) continue;
        divisors++;
        if(i * i != number) divisors++;
    }
    return divisors;
}


