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


int main (void) {
    unsigned int i;
    scanf ("%u", & i);
    unsigned int p;
    scanf ("%u", & p);
    int j = 0; 
    int s = 0;
    while (p > 0) {
        s = p % 10;
        if (s == p) {
            j++;
        }
        p /= 10;
    }
    printf ("%d", j);
}
