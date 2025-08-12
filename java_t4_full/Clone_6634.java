public static int count8 (int num) {
    int count = 0;
    boolean doubl = false;
    while (true) {
        int n = num % 10;
        num = num / 10;
        if (n == 8) {
            if (doubl) {
                count = count + 2;
            } else {
                count ++;
            }
            doubl = true;
        } else {
            doubl = false;
        }
        if (num == 0) break;
    }
    return count;
}




public static int count8(int num) {
    if(num == 0) 
       return 0;
    else 
       return (num % 10 == 8 ? 1 : 0) + count8(num / 10);
}


