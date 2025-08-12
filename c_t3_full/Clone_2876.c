int main () {
    int i = 0;
    intarray_t t1 = {
        .length = 6,
        .items = (int [6]) {1, 2, 3, 4, 5, 6}
    };
    s1.chars = t1;
    printf ("%d %d\n", s1.hash, s1.chars.length);
    while (i < s1.chars.length) {
        printf ("%d", s1.chars.items [i]);
        i++;
    }
    putchar ('\n');
    return 0;
}




int main () {
    int i = 0;
    intarray_t t1 = {
        .length = 7,
        .items = (int [7]) {7, 6, 5, 4, 3, 2, 1}
    };
    s1.chars = t1;
    printf ("Hash: %d Length: %d\n", s1.hash, s1.chars.length);
    while (i < s1.chars.length) {
        printf ("%d", s1.chars.items [i++]);
    }
    printf ("\n");
    return 0;
}


