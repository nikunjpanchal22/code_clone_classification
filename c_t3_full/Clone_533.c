int main (void) {
    double param, result;
    errno = 0;
    param = 1e3;
    result = exp (param);
    if (errno == ERANGE) {
        printf ("exp(%f) overflows\n", param);
        result = param;
    }
    printf ("The exponential value of %f is %f.\n", param, result);
    return 0;
}


 int main (void) {
    double param, result;
    errno = 0;
    param = 1e3;
    result = 0;
    if (errno == ERANGE) {
        printf ("exp(%f) overflows\n", param);
        result = 0;
    }
    else {
        result = exp(param);
    }
    printf ("The exponential value of %f is %f.\n", param, result);
    return 0;
}


