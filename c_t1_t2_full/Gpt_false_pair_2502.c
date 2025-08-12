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
    int buf_size = 0;
    int buf_used = 0;
    char *buf = NULL;
    char *tmp = NULL;
    char c;
    int i = 0;
	while ( (c = getchar ()) != EOF) {
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
    for (i = 0; i < buf_used; ++i) 
        printf("%c\n", buf [i]); 
    free (buf);
    return 0; 
}
