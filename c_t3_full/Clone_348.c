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
    int i, p, arr [40], index=0;
    do {
        p = prime (i);
        if (p == 1)
            arr[index] = i;
        else
            arr[index] = 0;
            printf ("%d\n", arr [index]);
            index++;
            i++;
    } while (i <= 40);
}


