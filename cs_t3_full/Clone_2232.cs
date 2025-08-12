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
    int count = 0;
    int sqrt = (int)Math.sqrt(number);

    for(int i=1; i<=sqrt; i++){
        if(number % i == 0){ 
            count++;

            if(i != sqrt){
                count++;
            }
        }
    }

    return count;
}


