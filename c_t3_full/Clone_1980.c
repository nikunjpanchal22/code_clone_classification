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
    while (min <= -1) {
        test(min);
        min++;
    }
    test(0);
    test(1);
    test(2);
    int max = INT_MAX;
    while (max > 2) {
        test(max);
        max--;
    }
    return 0;
}


