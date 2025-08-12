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


 int main(void) 
{ 
    int i, x, output = 0; 
    scanf("%d %d", &i, &x); 
    for (int p = x; p > 0; p /= 10)
        if(p%10 == i) output++;
    printf("%d", output); 
} 


