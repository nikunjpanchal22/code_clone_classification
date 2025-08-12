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
    uint32_t binaryVal = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int bitPos = rand () % 11;
        printf ("bitPos=%d\n", bitPos);
        binaryVal = insertPosition (binaryVal, bitPos);
    }
    invertBin (binaryVal);
    printf ("\n");
    return 0;
}
