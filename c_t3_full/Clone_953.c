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


 int main(void) {
    unsigned int i, x;
    scanf("%u %u", &i, &x);
    int output = 0;
    int t = 0;

    while (x > 0) {
        t = x % 10;
        if (t == i) {
            output++;
        }
        x /= 10;
    }
    printf("%d", output);
}


