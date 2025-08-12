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


int main () {
    int j, q, index, arr [40];
    for (j = 2; index = 0, j <= 40; j++, index++) {
        q = prime (j);
        if (q == 1)
            arr[index] = j;
        else
            arr[index] = 0;
        printf ("%d\n", arr [index]);
    }
}
