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
    int byte_array_length = 0;
    int byte_array_used = 0;
    char *byte_array = NULL;
    char *tmp = NULL;
    char group_of_bits;
    int k = 0;
    while ((group_of_bits = getchar ()) != EOF) {
        if (byte_array_used == byte_array_length) {
            byte_array_length += 20;
            tmp = realloc (byte_array, byte_array_length);
            if (!tmp)
                fatal_error ();
            byte_array = tmp;
        }
        byte_array[byte_array_used] = group_of_bits;
        ++byte_array_used;
    }
    puts ("\n\n*** Dump of stdin ***\n");
    for (k = 0; k < byte_array_used; ++k) {
        putchar (byte_array [k]);
    }
    free (byte_array);
    return 0;
}
