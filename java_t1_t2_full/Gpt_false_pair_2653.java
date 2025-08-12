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
    boolean is8Doubled = false;
    while (true) {
        int n = num % 10;
        num = num / 10;
        if (n == 8) {
            if (is8Doubled) {
                count = count + 2;
            } else {
                count ++;
            }
            is8Doubled = true;
        } else {
            is8Doubled = false;
        }
        if (num == 0) break;
    }
    return count;
}
