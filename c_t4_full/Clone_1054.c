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
    if(type == 3) {
        int *num = malloc(sizeof(int));
        *num = 10;
        return num;
    }
    else if(type == 4) {
        char *c_val = malloc(sizeof(char));
        *c_val = 'A';
        return c_val;
    }
    else
        return NULL;
}


