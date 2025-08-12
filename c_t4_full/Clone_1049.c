int main () {
    int *ptr_int = func (3);
    char *ptr_char = func (4);
    fprintf (stdout, "int value = %d\n", * ptr_int);
    fprintf (stdout, "char value = %c\n", * ptr_char);
    free (ptr_int);
    free (ptr_char);
    return 0;
}





void* func(int type) {
    switch(type) {
        case 3: {
            int *n = malloc(sizeof(int));
            *n = 20;
            return n;
        }
        case 4: {
            char *ch = malloc(sizeof(char));
            *ch = 'B';
            return ch;
        }
        default:
            return NULL;
    }
}


