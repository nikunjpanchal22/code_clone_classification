int main () {
    int n, count;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    count = 0;
    n++;
    for (; count < 10; n++) {
        if (isPrime (n)) {
            printf ("%d\n", n);
            count++;
        }
    }
    return 0;
}


 int main() 
{ 
    int n, count; 
    printf("Insert a number:\n"); 
    scanf("%d", &n); 
    count = 0; 
    while (count < 10) 
    { 
        n++; 
        if (isPrime(n) == 1) 
        { 
            printf("%d\n", n); 
            count++; 
        } 
    } 
    return 0;
}
