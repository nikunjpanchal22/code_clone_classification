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





void factorial9(mpz_t result, int n) {
    mpz_t temp1;
    mpz_init_set_ui(temp1, n);

    mpz_t temp2;
    mpz_init_set_ui(temp2, n-1);
    while (n-->1) {
        mpz_mul(temp1, temp1, temp2);
        mpz_sub_ui(temp2, temp2, 1);
    }
    mpz_swap(result, temp1);
    mpz_clear(temp1);
    mpz_clear(temp2);
}


