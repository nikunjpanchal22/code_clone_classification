int main (int argc, char **argv) {
    int buf_size = 0;
    int buf_used = 0;
    char *buf = NULL;
    char *tmp = NULL;
    char c;
    int i = 0;
    while ((c = getchar ()) != EOF) {
        if (buf_used == buf_size) {
            buf_size += 20;
            tmp = realloc (buf, buf_size);
            if (!tmp)
                fatal_error ();
            buf = tmp;
        }
        buf[buf_used] = c;
        ++buf_used;
    }
    puts ("\n\n*** Dump of stdin ***\n");
    for (i = 0; i < buf_used; ++i) {
        putchar (buf [i]);
    }
    free (buf);
    return 0;
}


int main (int argc, char **argv) {
    int size = 0;
    int count = 0;
    char *buf = NULL;
    char *temp = NULL;
    char character;
    int i = 0;
	while ((character = getchar ()) != EOF) {
        if (count == size) {
            size += 20;
            temp = realloc (buf, size);
            if (!temp)
                fatal_error ();
            buf = temp;
        }
        buf[count] = character;
        ++count;
    }
    puts ("\n\n*** Dump of stdin ***\n");
    for (i = 0; i < count; ++i) 
        printf("%c\n", buf [i]); 
    free (buf);
    return 0; 
}
