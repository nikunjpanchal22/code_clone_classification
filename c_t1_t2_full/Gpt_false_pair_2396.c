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


int main () {
    mpz_t fact;
    unsigned long input = 0;
    char *buf;
    mpz_init (fact);
    scanf ("%lu", & input);
    int result = factorial (fact, input);
    if (result == 0)
    {
        buf = malloc (mpz_sizeinbase (fact, 10) + 1);
        assert (buf);
        mpz_get_str (buf, 10, fact);
        printf ("%s\n", buf);
        free (buf);
    }
    else
    {
        printf("Factorial calculation failed\n");
    }
    mpz_clear (fact);
}
