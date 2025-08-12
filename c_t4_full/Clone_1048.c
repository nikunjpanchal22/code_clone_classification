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
    union {
        int i;
        char ch;
    } u;
    if(type == 3) {
        int *num = malloc(sizeof(u.i));
        *num = 60;
        return num;
    }
    else if(type == 4) {
        char *c_val = malloc(sizeof(u.ch));
        *c_val = 'F';
        return c_val;
    }
    else
        return NULL;
}


