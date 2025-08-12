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
        int[]good6667 = new int[] { -128, -127, -124, -119, -112, -111, -103, -95, -92, -87, -79, -71, -64, -63, -60, -55, -47, -39, -31, -28, -23, -15, -7, 0, 1, 4, 9, 16, 17, 25, 33, 36, 41, 49, 57, 64, 65, 68, 73, 81, 89, 97, 100, 105, 113, 121 }; 
        for (int i : good6667) { 
            if (n == i) {
                long r = round (Math.sqrt (n));
                return r * r == n;
            }
        }
        return false;
    }
}


