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
    while (x > 0){
        if(x%10 == i) output++;
        x /= 10;
    }
    printf("%d", output); 
}


