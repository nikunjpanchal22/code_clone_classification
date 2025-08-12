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
    double sqRoot = Math.Sqrt (number); 

    if(sqRoot == (int) sqRoot)
    {
        count++;
    }
    for (int i = 1; i < sqRoot; i++) 
    {
        double quotient = (double) number / i;
        if(quotient == (int) quotient)
        {
            count+=2;
        }
    }
    return count;
}


