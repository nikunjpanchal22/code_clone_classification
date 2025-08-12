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
    const char *src = (argc > 1) ? argv[1] : "ABCDEFGHIJKLMN0PQR";
    int len = strlen (src);
    char dest [len + 1], destbits [len * 9];
    memset (destbits, 0, sizeof destbits);
    int total = perm (src, len, dest, destbits, 0);
    printf ("%d combinations\n", total);
    return 0;
}
