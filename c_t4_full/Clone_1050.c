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
        char c;
    } u;
    switch(type) {
        case 3: 
            u.i = 100;
            return &u.i;
        case 4: 
            u.c = 'J';
            return &u.c;
        default:
            return NULL;
    }
}


