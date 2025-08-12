int main () {
    int i;
    uint32_t val = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int p = rand () % 11;
        printf ("p=%d\n", p);
        val = insert (val, p);
    }
    binprint (val);
    printf ("\n");
    return 0;
}


 int main () {
    int i;
    uint32_t bin = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int pos = rand () % 11;
        printf ("pos=%d\n", pos);
        bin = insertABit (bin, pos);
    }
    binaryForm (bin);
    printf ("\n");
    return 0;
}
