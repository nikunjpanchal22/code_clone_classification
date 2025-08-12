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
    for (int i = INT_MIN; i < 0; i++) {
        test(i);
    }
    for (int j = 0; j <= 2; j++) {
        test(j);
    }
    for (int k = 3; k <= INT_MAX; k++) {
        test(k);
    }
    return 0;
}


