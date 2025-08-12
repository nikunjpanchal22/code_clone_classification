public static boolean isPerfectSquare (long n) {
    if (n < 0) {
        return false;
    } else {
        switch ((byte) n) {
            case - 128 :
            case - 127 :
            case - 124 :
            case - 119 :
            case - 112 :
            case - 111 :
            case - 103 :
            case - 95 :
            case - 92 :
            case - 87 :
            case - 79 :
            case - 71 :
            case - 64 :
            case - 63 :
            case - 60 :
            case - 55 :
            case - 47 :
            case - 39 :
            case - 31 :
            case - 28 :
            case - 23 :
            case - 15 :
            case - 7 :
            case 0 :
            case 1 :
            case 4 :
            case 9 :
            case 16 :
            case 17 :
            case 25 :
            case 33 :
            case 36 :
            case 41 :
            case 49 :
            case 57 :
            case 64 :
            case 65 :
            case 68 :
            case 73 :
            case 81 :
            case 89 :
            case 97 :
            case 100 :
            case 105 :
            case 113 :
            case 121 :
                long i = (n * INV3465)>>> 52;
                if (! good3465 [(int) i]) {
                    return false;
                } else {
                    long r = round (Math.sqrt (n));
                    return r * r == n;
                }
            default :
                return false;
        }
    }
}


 
public static boolean isPerfectSquare (long n) {
    if (n < 0) {
        return false;
    } else {
        if (n == -128 || n == -127 || n == -124 || n == -119 || n == -112 || n == -111 || n == -103 || n == -95 || n == -92 || n == -87 || n == -79|| n == -71 || n == -64 || n == -63 || n == -60 || n == -55 || n == -47 || n == -39 || n == -31 || n == -28 || n == -23|| n == -15 || n == -7 || n == 0 || n == 1 || n == 4 || n == 9 || n == 16 || n == 17 || n == 25 || n == 33 || n == 36 || n == 41 || n == 49 || n == 57 || n == 64 || n == 65 || n == 68|| n == 73 || n == 81 || n == 89 || n == 97 || n == 100 || n == 105 || n == 113 || n == 121) {
            long r = round (Math.sqrt (n));
            return r * r == n;
        }
        return false;
    }
}


