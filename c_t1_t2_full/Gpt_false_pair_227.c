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


 int main()
{
    clock_t start, end;
    start = clock();
    int h;
    for (int i = 0; i < 101; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            h++;
        }
    }
    end = clock();
    printf("start = %d, end = %d\n", start, end);
    return 0;
}
