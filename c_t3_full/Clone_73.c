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
    int *ptr_int = func (3);
    char *ptr_char = func (4);
    if (ptr_int != NULL) {
        fprintf (stdout, "int value = %d\n", * ptr_int);
        free (ptr_int);
    }
    if (ptr_char != NULL) {
        fprintf (stdout, "char value = %c\n", * ptr_char);
        free (ptr_char);
    }
    return 0;
}


