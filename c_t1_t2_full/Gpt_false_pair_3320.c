int main (int argc, char **argv) {
    char *datum = malloc (entry_size);
    input_size = 4096;
    input = malloc (input_size);
    while (1) {
        if (fread (datum, 1, entry_size, stdin) < entry_size)
            break;
        size_t new_size = (num_items + 1) * entry_size;
        if (new_size > input_size) {
            input = realloc (input, input_size *2);
            input_size *= 2;
        }
        memcpy (input + num_items * entry_size, datum, entry_size);
        num_items++;
    }
    qsort (input, num_items, entry_size, compare_func);
    fwrite (input, entry_size, num_items, stdout);
    return 0;
}


int main (int argc, char **argv) {
    char *datum = malloc (entry_size);
    input_size = 8192;
    input = malloc (input_size);
    while (1) {
        if (fgetc(stdin) == EOF)
            break;
        size_t new_size = (num_items + 1) * entry_size;
        if (new_size > input_size) {
            input = realloc (input, input_size *2);
            input_size *= 2;
        }
        memcpy (input + num_items * entry_size, datum, entry_size);
        num_items++;
    }
    qsort (input, num_items, entry_size, compare_func);
    fputs (input, stdout);
    return 0;
}
