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
        int[] good5871 = new int[36];
        good5871[0] = -128;
        good5871[1] = -127;
        good5871[2] = -124;
        good5871[3] = -119;
        good5871[4] = -112;
        good5871[5] = -111;
        good5871[6] = -103;
        good5871[7] = -95;
        good5871[8] = -92;
        good5871[9] = -87;
        good5871[10] = -79;
        good5871[11] = -71;
        good5871[12] = -64;
        good5871[13] = -63;
        good5871[14] = -60;
        good5871[15] = -55;
        good5871[16] = -47;
        good5871[17] = -39;
        good5871[18] = -31;
        good5871[19] = -28;
        good5871[20] = -23;
        good5871[21] = -15;
        good5871[22] = -7;
        good5871[23] = 0;
        good5871[24] = 1;
        good5871[25] = 4;
        good5871[26] = 9;
        good5871[27] = 16;
        good5871[28] = 17;
        good5871[29] = 25;
        good5871[30] = 33;
        good5871[31] = 36;
        good5871[32] = 41;
        good5871[33] = 49;
        good5871[34] = 57;
        good5871[35] = 64;
        good5871[36] = 65;
        good5871[37] = 68;
        good5871[38] = 73;
        good5871[39] = 81;
        good5871[40] = 89;
        good5871[41] = 97;
        good5871[42] = 100;
        good5871[43] = 105;
        good5871[44] = 113;
        good5871[45] = 121;
        for (int i = 0; i < good5871.length; i++) { 
            if (n == good5871[i]) {
                long r = round (Math.sqrt (n));
                return r * r == n;
            }
        }
        return false;
    }
}


