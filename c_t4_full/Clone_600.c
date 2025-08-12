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
    int length = 6;
    intarray_t t1 = (intarray_t) { .length = length, .items = malloc(length * sizeof(int)) };
    for (i = 0; i < length; ++i) {
        t1.items[i] = i + 1;
    }
    s1.chars = t1;
    printf ("%d %d\n", s1.hash, length);
    for (i = 0; i < length; ++i) {
        printf ("%d", t1.items[i]);
    }
    putchar ('\n');
    free(t1.items);
    return 0;
}


