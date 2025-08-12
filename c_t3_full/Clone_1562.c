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
    for(n = n + 1, count = 0; count < 10; n++) 
    { 
        if (isPrime(n) == true) 
        { 
            printf("%d\n", n); 
            count++; 
        } 
    } 
    return 0;
}


