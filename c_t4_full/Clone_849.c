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
    int min = INT_MIN;
    while (min <= INT_MAX) {
        test(min);
        min++;
    }
    return 0;
}


