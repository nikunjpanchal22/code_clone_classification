int main () {
    const char *text = "I have a program that displays UTF-8 encoded strings " "with a size limitation (say MAX_LEN). Whenever I get a string with a " "length > MAX_LEN, I want to find out where I could split it so it " "would be printed gracefully.";
    substr_t lines [100];
    const uint32_t max_num_lines = sizeof (lines) / sizeof (lines[0]);
    const int num_lines = wrap (text, 48, lines, max_num_lines);
    if (num_lines < 0) {
        fprintf (stderr, "error: can't split into %d lines\n", max_num_lines);
        return EXIT_FAILURE;
    }
    for (int i = 0; i < num_lines; i++) {
        FILE *stream = stdout;
        const ptrdiff_t line_length = lines[i].end - lines[i].begin;
        write (fileno (stream), lines [i].begin, line_length);
        fputc ('\n', stream);
    }
    return EXIT_SUCCESS;
}


 int main () {
    const char *text = "I have a program that displays UTF-8 encoded strings " "with a size limitation (say MAX_LEN). Whenever I get a string with a " "length > MAX_LEN, I want to find out where I could split it so it " "would be printed gracefully.";
    substr_t lines [100];
    const uint32_t max_num_lines = sizeof (lines) / sizeof (lines[0]);
    const int num_lines = fitString (text, 48, lines, max_num_lines);
    if (num_lines < 0) {
        fprintf (stderr, "error: can't split into %d lines\n", max_num_lines);
        return EXIT_FAILURE;
    }
    for (int i = 0; i < num_lines; i++) {
        FILE *stream = stdout;
        const ptrdiff_t line_length = lines[i].end - lines[i].begin;
        write (fileno (stream), lines [i].begin, line_length);
        fputc ('\n', stream);
    }
    return EXIT_SUCCESS;
}
