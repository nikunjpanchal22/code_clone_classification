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


 #include<stdio.h>
int main() 
{ 
    unsigned int i, x, output = 0, t = 0; 
    scanf("%u %u", &i, &x); 
    while (x > 0) 
    {
            t = x % 10; 
            if (t == i) 
            output++; 
            x /= 10; 
    } 
    printf("%d", output); 
} 


