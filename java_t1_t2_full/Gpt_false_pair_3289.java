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


public static double count8 (double num) {
    double count = 0.0;
    boolean doubl = false;
    while (true) {
        double n = num % 10.0;
        num = num / 10.0;
        if (n == 8.0) {
            if (doubl) {
                count = count + 2.0;
            } else {
                count ++;
            }
            doubl = true;
        } else {
            doubl = false;
        }
        if (num == 0.0) break;
    }
    return count;
}
