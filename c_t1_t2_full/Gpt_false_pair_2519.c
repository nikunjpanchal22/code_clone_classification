void main () {
    int i, p, index, arr [40];
    for (i = 2; index = 0, i <= 40; i++, index++) {
        p = prime (i);
        if (p == 1)
            arr[index] = i;
        else
            arr[index] = 0;
        printf ("%d\n", arr [index]);
    }
}


void main () {
    int i, p, idx, ary [40];
    for (i = 2; idx = 0, i <= 40; i++, idx++) {
        p = isPrime (i);
        if (p == 1)
            ary[idx] = i;
        else
            ary[idx] = 0;
        printf ("%d\n", ary [idx]);
    }
}
