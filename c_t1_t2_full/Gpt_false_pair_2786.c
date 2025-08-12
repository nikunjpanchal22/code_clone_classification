int main () {
    clock_t begin = clock ();
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    clock_t end = clock ();
    printf ("Time taken:%lf", (double) (end - begin) / CLOCKS_PER_SEC);
}


int main() {
    clock_t begin = clock();
    int i; 
    for (i = 0; i < 100000; i++) {
        printf("%d\n", i); 
    }
    clock_t end = clock();
    printf("Time taken:%lf", (double) (end - begin) / CLOCKS_PER_SEC);
}
