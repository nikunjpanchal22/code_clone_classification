int main (void) {
    test (INT_MIN);
    test (- 2);
    test (- 1);
    test (0);
    test (1);
    test (2);
    test (INT_MAX);
    return 0;
}


 int main(void) {
    for (int i = INT_MIN; i <= INT_MAX; i++) {
        if (i != -2 && i != -1) {
            test(i);
        }
    }
    return 0;
}


