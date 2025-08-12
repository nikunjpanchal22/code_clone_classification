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
    int i, p, index, arr [40];
    index = 0;
    while (i <= 40) {
        p = prime (i);
        arr[index] = p ? i : 0;
        printf("%d\n", arr[index]);
        index++;
        i++;
    }
}


