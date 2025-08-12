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
    int numbers[] = { INT_MIN, -2, -1, 0, 1, 2, INT_MAX };
    for (int i = 0; i < 7; i++) {
        test(numbers[i]);
    }
    return 0;
}


