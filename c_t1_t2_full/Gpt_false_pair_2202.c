int main (int argc, char *argv []) {
    const char *src = (argc > 1) ? argv[1] : "123456789";
    int len = strlen (src);
    char dest [len], destbits [len];
    memset (destbits, 0, sizeof destbits);
    int total = perm (src, len, dest, destbits, 0);
    printf ("%d combinations\n", total);
    return 0;
}


 int main (int argc, char *argv []) {
    const char *src = (argc > 1) ? argv[1] : "STUVWXYZ@[\\]^_";
    int len = strlen (src);
    char dest [len + 1], destbits [len * 10];
    memset (destbits, 0, sizeof destbits);
    int total = perm (src, len, dest, destbits, 0);
    printf ("%d combinations\n", total);
    return 0;
}
