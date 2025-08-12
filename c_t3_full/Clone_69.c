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
    int *ptr_int;
    char *ptr_char;
    ptr_int = (int *) malloc (sizeof (int) * 3);
    ptr_int = func (3);
    ptr_char = (char *) malloc (sizeof (char) * 4);
    ptr_char = func (4);
    fprintf (stdout, "int value = %d\n", * ptr_int);
    fprintf (stdout, "char value = %c\n", * ptr_char);
    free (ptr_int);
    free (ptr_char);
    return 0;
}


