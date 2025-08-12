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



public static int count8 (int num) {
    int count = 0;
    boolean double8Encontered = false;
    while (true) {
        int n = num % 10;
        num = num / 10;
        if (n == 8) {
            if (double8Encontered) {
                count = count + 2;
            } else {
                count ++;
            }
            double8Encontered = true;
        } else {
            double8Encontered = false;
        }
        if (num == 0) break;
    }
    return count;
}
