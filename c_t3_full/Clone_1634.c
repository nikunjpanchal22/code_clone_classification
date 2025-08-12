int main (void) {
    enum insn some_insn = sysenter;
    char *insn = "sysenter";
    uint64_t val = 0;
    strncpy ((char *) & val, insn, sizeof (uint64_t));
    printf ("size: %" PRIuPTR "\n", sizeof (enum insn));
    if (some_insn == val) {
        puts ("Works");
    }
    else {
        puts ("Doesn't work");
    }
    return EXIT_SUCCESS;
}


 int main (void) {
    enum insn some_insn = sysenter;
    char *insn = "sysenter";
    uint64_t val = 0;
    int j = 0, insn_len = strlen (insn);
    while (j < insn_len) {
        memcpy ((char *) &val + j, insn + j, 1);
        j++;
    }
    printf ("size: %" PRIuPTR "\n", sizeof (enum insn));
    if (some_insn == val) {
        puts ("Works");
    }
    else {
        puts ("Doesn't work");
    }
    return EXIT_SUCCESS;
}


