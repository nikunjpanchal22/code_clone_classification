int main () {
    int *ptr_int = func (3);
    char *ptr_char = func (4);
    fprintf (stdout, "int value = %d\n", * ptr_int);
    fprintf (stdout, "char value = %c\n", * ptr_char);
    free (ptr_int);
    free (ptr_char);
    return 0;
}


int main () {
    short *ptr_short = func (3);
    long *ptr_long = func (4);
    fprintf (stdout, "short value = %d\n", * ptr_short);
    fprintf (stdout, "long value = %ld\n", * ptr_long);
    free (ptr_short);
    free (ptr_long);
    return 0;
}
