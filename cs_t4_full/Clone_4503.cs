public static int Delta (int a, int b) {
    int delta = 0;
    if (a == b) {
        return 0;
    } else if (a < b) {
        while (a < b) {
            a ++;
            delta ++;
        }
        return delta;
    } else {
        while (b < a) {
            b ++;
            delta ++;
        }
        return delta;
    }
}


 public static int Delta(int a, int b) {
    int lower, higher;
    if(a > b) {
        higher = a;
        lower = b;
    }
    else {
        higher = b;
        lower = a;
    }
    int delta = 0;
    for(int i = lower; i < higher; i++)
        delta++;
    return delta;
}


