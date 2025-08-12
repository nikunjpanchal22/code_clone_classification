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
        long nums[] = new long[36];
        nums[0] = -128L;
        nums[1] = -127L;
        nums[2] = -124L;
        nums[3] = -119L;
        nums[4] = -112L;
        nums[5] = -111L;
        nums[6] = -103L;
        nums[7] = -95L;
        nums[8] = -92L;
        nums[9] = -87L;
        nums[10] = -79L;
        nums[11] = -71L;
        nums[12] = -64L;
        nums[13] = -63L;
        nums[14] = -60L;
        nums[15] = -55L;
        nums[16] = -47L;
        nums[17] = -39L;
        nums[18] = -31L;
        nums[19] = -28L;
        nums[20] = -23L;
        nums[21] = -15L;
        nums[22] = -7L;
        nums[23] = 0L;
        nums[24] = 1L;
        nums[25] = 4L;
        nums[26] = 9L;
        nums[27] = 16L;
        nums[28] = 17L;
        nums[29] = 25L;
        nums[30] = 33L;
        nums[31] = 36L;
        nums[32] = 41L;
        nums[33] = 49L;
        nums[34] = 57L;
        nums[35] = 64L;
        nums[36] = 65L;
        nums[37] = 68L;
        nums[38] = 73L;
        nums[39] = 81L;
        nums[40] = 89L;
        nums[41] = 97L;
        nums[42] = 100L;
        nums[43] = 105L;
        nums[44] = 113L;
        nums[45] = 121L;     
        for (long i : nums) { 
            if (n == i) {
                long r = round (Math.sqrt (n));
                return r * r == n;
            }
        }
        return false;
    }
}


