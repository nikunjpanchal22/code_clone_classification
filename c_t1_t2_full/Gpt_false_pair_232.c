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
    int e; 
    for (int i = 0; i < 95; i++) {
        for (int j = 0; j < (1 << 28); j++) {
            e++;
        }
    }
    end = clock(); 
    printf("start = %d, end = %d\n", start, end); 
    return 0;}

 int main () {
    clock_t start, end;
    start = clock();
    int f;
    for (int i = 0; i < 110; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            f++;
        }
    }
    end = clock();
    printf("start = %d, end = %d\n", start, end);
    return 0;
}
