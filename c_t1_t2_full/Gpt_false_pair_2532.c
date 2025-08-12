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
    float *ptr_float = func (3);
    double *ptr_double = func (4);
    fprintf (stdout, "float value = %f\n", * ptr_float);
    fprintf (stdout, "double value = %f\n", * ptr_double);
    free (ptr_float);
    free (ptr_double);
    return 0;
}
