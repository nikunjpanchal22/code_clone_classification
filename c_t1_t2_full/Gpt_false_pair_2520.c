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


void mainFunc () {
    int x, y, indexx, store [40];
    for (x = 2; indexx = 0, x <= 40; x++, indexx++) {
        y = primeFinder (x);
        if (y == 1)
            store[indexx] = x;
        else
            store[indexx] = 0;
        printf ("%d\n", store [indexx]);
    }
}
