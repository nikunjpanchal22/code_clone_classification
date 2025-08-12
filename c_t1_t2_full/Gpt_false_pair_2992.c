int main (void) {
    char *input1 = get_string ();
    double numbers [100];
    int n;
    char *p = input1;
    char *q;
    for (n = 0; n < 100; n++) {
        numbers[n] = strtod (p, &q);
        if (p == q) {
            break;
        }
        p = q;
    }
    for (int i = 0; i < n; i++) {
        printf ("%f\n", numbers [i]);
    }
    return 0;
}


int main (void) {
    char *input2 = get_string ();
    double numbers [100]; 
    int n;
    char *p = input2;
    char *q;
    for (n = 0; n < 100; n++) {
        numbers[n] = strtod (p, &q);
        if (p == q) {
            break;
        }
        p = q;
    }
    for (int i = 0; i < n; i++) {
        printf ("Value at %d element is %f\n", i, numbers [i]);
    }
    return 0;
}
