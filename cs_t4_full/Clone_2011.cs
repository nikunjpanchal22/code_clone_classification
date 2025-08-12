static void doubleNumber (int [] n) {
    int carry = 0;
    for (int i = 0; i < n.Length; i ++) {
        n [i] <<= 1;
        n [i] += carry;
        if (n [i] >= 1000000000) {
            carry = 1;
            n [i] -= 1000000000;
        } else {
            carry = 0;
        }
    }
}


 static void doubleNumber (int [] n) {
    int carry = 0;
    for (int i = 0; i < n.Length; i ++) {
        int temp = n[i] ;
        temp <<= 1;
        temp += carry;
        if (temp >= 1000000000) {
            carry = 1;
            n [i] = temp- 1000000000;
        } else {
            carry = 0;
            n[i] = temp;
        }
    }
}


