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
    boolean double8Detected = false;
    while (true) {
        int n = num % 10;
        num = num / 10;
        if (n == 8) {
            if (double8Detected) {
                count = count + 2;
            } else {
                count ++;
            }
            double8Detected = true;
        } else {
            double8Detected = false;
        }
        if (num == 0) break;
    }
    return count;
}
