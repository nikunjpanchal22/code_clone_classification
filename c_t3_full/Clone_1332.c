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


 int main() {
    int i = 0;
    intarray_t t1 = { .length = 6 };
    for (i = 0; i < t1.length; ++i) {
        t1.items[i] = ++i;
    }
    s1.chars = t1;
    printf ("%d %d\n", s1.hash, t1.length);
    for (i = 0; i < t1.length; ++i) {
        printf ("%d", t1.items[i]);
    }
    putchar ('\n');
    return 0;
}


