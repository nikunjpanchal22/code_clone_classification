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
    unsigned int m;
    scanf ("%u", & m);
    unsigned int q;
    scanf ("%u", & q);
    int w = 0;
    int e = 0;
    while (q > 0) {
        e = q % 10;
        if (e == q) {
            w++;
        }
        q /= 10;
    }
    printf ("%d", w);
}
