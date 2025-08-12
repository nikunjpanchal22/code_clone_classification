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
    int sum = 0;
    int carry = 0;
    for (int i = 0; i < n.Length; i ++) {
        sum = n[i] * 2;
        n[i] = sum + carry;
        if (n[i] >= 1000000000) {
            carry = 1;
            n [i] -= 1000000000;
        } else {
            carry = 0;
        }
    }
}


