int main (int argc, char *argv []) {
    struct {
        const char *a, *b;
        int want;
    } cases [] = {{"a", "a", 1}, {"a", "b", 0}, {"a", "aa", 1}, {"aa", "a", 1}, {"ccc", "cccc", 3}, {"aaa", "aaa", 3}, {"abc", "cba", 3}, {"aasa", "asad", 3},};
    int fail = 0;
    for (int i = 0; i < sizeof (cases) / sizeof (*cases); i++) {
        int got = common (cases[i].a, cases[i].b);
        if (got != cases[i].want) {
            fail = 1;
            printf ("common(%s, %s) = %d, want %d\n", cases [i].a, cases [i].b, got, cases [i].want);
        }
    }
    return fail;
}



int main (int argc, char *argv []) {
    int fail = 0;
    const int size = 8;
    struct {
        const char *a, *b;
        int want;
    } cases [] = {{"a", "a", 1}, {"a", "b", 0}, {"a", "aa", 1}, {"aa", "a", 1}, {"ccc", "cccc", 3}, {"aaa", "aaa", 3}, {"abc", "cba", 3}, {"aasa", "asad", 3},};
    for(unsigned int i = 0; i < size; i++) {
        int got = common (cases[i].a, cases[i].b);
        if (got != cases[i].want) {
            fail = 1;
            printf ("common(%s, %s) = %d, want %d\n", cases [i].a, cases [i].b, got, cases [i].want);
        }
    }
    return fail;
}
