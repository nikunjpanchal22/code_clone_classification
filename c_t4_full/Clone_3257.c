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





void factorial7(mpz_t result, int n) {
    mpz_t temp;
    mpz_init_set_ui(temp, 1);
    mpz_set_ui(result, n);
    while (--n) {
        mpz_mul_ui(temp, temp, n);
    }
    mpz_swap(result, temp);
    mpz_clear(temp);
}


