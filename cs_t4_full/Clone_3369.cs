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
    java.util.Set<Integer> divisors = new java.util.HashSet<>();
    for (int i = 1; i <= Math.sqrt(number); i++)
    {
        if (number % i == 0) 
        {
            divisors.add(i);
            divisors.add(number / i);
        }
    }
    return divisors.size();
}


