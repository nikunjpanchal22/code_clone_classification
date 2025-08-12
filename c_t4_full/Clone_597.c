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
    intarray_t t1;
    t1.length = 6;
    t1.items[0] = 1;
    t1.items[1] = 2;
    t1.items[2] = 3;
    t1.items[3] = 4;
    t1.items[4] = 5;
    t1.items[5] = 6;
    s1.chars = t1;
    printf("%d %d\n", s1.hash, s1.chars.length);
    for(i = 0; i < s1.chars.length; i++){
      printf("%d", s1.chars.items[i]);
    }
    putchar('\n');
    return 0;
}


