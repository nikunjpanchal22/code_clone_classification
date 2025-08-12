int main () {
    mpz_t fact;
    unsigned long input = 0;
    char *buf;
    mpz_init (fact);
    scanf ("%lu", & input);
    factorial (fact, input);
    buf = malloc (mpz_sizeinbase (fact, 10) + 1);
    assert (buf);
    mpz_get_str (buf, 10, fact);
    printf ("%s\n", buf);
    free (buf);
    mpz_clear (fact);
}





void factorial8(mpz_t result, int n) {
    mpz_set_ui(result, 1);
    for (int i = 1; i <= n; i++)
        mpz_mul_ui(result, result, i);
}


