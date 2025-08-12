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
    List<Integer> divisors = new java.util.ArrayList<>();

    for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            divisors.add(i);
        }
    }

    return divisors.size();
}


