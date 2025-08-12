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
        long[] good4979 = { - 128L, - 127L, - 124L, - 119L, - 112L, - 111L, - 103L, - 95L, - 92L, - 87L, - 79L, - 71L, - 64L, - 63L, -60L, - 55L, - 47L, - 39L, - 31L, - 28L, - 23L, - 15L, - 7L, 0L, 1L, 4L, 9L, 16L, 17L,25L, 33L, 36L, 41L, 49L, 57L, 64L, 65L, 68L, 73L, 81L, 89L, 97L, 100L, 105L, 113L, 121L }; 
        for (int i = 0; i < good4979.length; i++) { 
            if (n == good4979[i]) {
                long r = round (Math.sqrt (n));
                return r * r == n;
            }
        }
        return false;
    }
}


