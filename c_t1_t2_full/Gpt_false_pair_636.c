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
    uint32_t result = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int place = rand () % 11;
        printf ("place=%d\n", place);
        result = addBit (result, place);
    }
    printBinary (result);
    printf ("\n");
    return 0;
}
