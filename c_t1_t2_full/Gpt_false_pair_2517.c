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
    int k, r, index, arr [40];
    for (k = 2; index = 0, k <= 40; k++, index++) {
        r = prime (k);
        if (r == 1)
            arr[index] = k;
        else
            arr[index] = 0;
        printf ("%d\n", arr [index]);
    }
}
