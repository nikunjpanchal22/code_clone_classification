int main (int argc, char *argv []) {
    int src [argc], dest [argc];
    int cur, max = 0, n = argc - 1;
    for (int i = 0; i < n; i++) {
        src[i] = cur = atoi (argv[i + 1]);
        if (max < cur)
            max = cur;
    }
    if (max < 9) {
        encode9 (dest, src, n);
    }
    else {
        encode64 (dest, src, n);
    }
    for (int i = 0; i < n; i++) {
        printf ("%d ", dest [i]);
    }
    printf ("\n");
    return 0;
}


 int main (int argc, char *argv []) {
    int src [argc], dest [argc];
    int cur, max = 0, n = argc - 1;
    for (int i = 0; i < n; i++) {
        src[i] = cur = atoi (argv[i + 1]);
        if (max < cur)
            max = cur;
    }
    if (max < 3) {
        encode3 (dest, src, n);
    }
    else if (max < 6) {
        encode6 (dest, src, n);
    }
    else if (max < 12) {
        encode12 (dest, src, n);
    }
    else if (max < 24) {
        encode24 (dest, src, n);
    }
    else {
        encode48 (dest, src, n);
    }
    for (int i = 0; i < n; i++) {
        printf ("%d ", dest [i]);
    }
    printf ("\n");
    return 0;
}


