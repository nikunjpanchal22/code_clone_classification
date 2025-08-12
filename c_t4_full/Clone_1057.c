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
    void *ptr = NULL;
    if(type == 3) {
        ptr = malloc(sizeof(int));
        *(int*)ptr = 30;
    }
    else if(type == 4) {
        ptr = malloc(sizeof(char));
        *(char*)ptr = 'C';
    }
    return ptr;
}


