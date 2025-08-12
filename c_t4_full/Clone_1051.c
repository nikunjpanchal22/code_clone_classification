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
            int *num = calloc(1, sizeof(int));
            *num = 90;
            return num;
        }
        case 4: {
            char *ch = calloc(1, sizeof(char));
            *ch = 'I';
            return ch;
        }
        default:
            return NULL;
    }
}


