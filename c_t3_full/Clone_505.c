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
    if (max < 2) {
        encode2 (dest, src, n);
    }
    else if (max < 4) {
        encode4 (dest, src, n);
    }
    else if (max < 6) {
        encode6 (dest, src, n);
    }
    else if (max < 8){
        encode8 (dest, src, n);
    }
    else if (max < 10){
        encode10 (dest, src, n);
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


