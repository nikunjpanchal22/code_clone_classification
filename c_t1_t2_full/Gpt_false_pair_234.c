int main (void) {
    clock_t start, end;
    start = clock ();
    int c;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    end = clock ();
    printf ("start = %d, end = %d\n", start, end);
    return 0;
}


  int main(void) {
    clock_t start, end;
    start = clock();
    int d;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 28); j++) {
            d++;
        }
    }
    end = clock();
    printf("start = %d, end = %d\n", start, end);
    return 0;
}
