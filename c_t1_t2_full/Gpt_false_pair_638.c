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
    uint32_t binary = 01111111111;
    srand (time (NULL));
    for (i = 0; i < 4; i++) {
        int site = rand () % 11;
        printf ("site=%d\n", site);
        binary = insertAt (binary, site);
    }
    displayBin (binary);
    printf ("\n");
    return 0;
}
