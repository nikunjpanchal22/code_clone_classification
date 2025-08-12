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
    memset ((char *) &val, 0, sizeof (uint64_t));
    for (int i = 0; i < 6; i++) {
        memcpy ((char*) &val + i, insn + i, 1);
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
