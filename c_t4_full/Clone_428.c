int main (void) {
    unsigned int i;
    scanf ("%u", & i);
    unsigned int x;
    scanf ("%u", & x);
    int output = 0;
    int t = 0;
    while (x > 0) {
        t = x % 10;
        if (t == x) {
            output++;
        }
        x /= 10;
    }
    printf ("%d", output);
}


 int main() 
{ 
    unsigned int i, x, output = 0, t; 
    scanf("%u %u", &i, &x); 
    do  
    { 
        t = x % 10; 
        if (t == i) 
            output++; 
        x /= 10; 
    } while (x > 0); 
    printf("%d", output); 
} 


