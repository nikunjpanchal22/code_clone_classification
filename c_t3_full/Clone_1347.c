int main () {
    char *a = malloc (10);
    char *b = malloc (10);
    char *c = malloc (10);
    memset (a, 'a', 4095);
    memset (b, 'b', 4095);
    memset (c, 'c', 4095);
    puts (a);
    memset (c, 0xc3, 10);
    mprotect (c, 10, PROT_READ | PROT_EXEC);
    b[0] = 'H';
    char *d = mmap (0, 4096, PROT_READ | PROT_WRITE | PROT_EXEC, MAP_PRIVATE | MAP_ANON, -1, 0);
    memset (d, 0xc3, 4096);
    ((void (*)(void)) d) ();
    ((void (*)(void)) c) ();
    return 0;
}


 int main () {
    char *a = (char *)malloc(10 * sizeof(char));
    char *b = (char *)malloc(10 * sizeof(char));
    char *c = (char *)malloc(10 * sizeof(char));
    memset(a, 'a', 10);
    memset(b, 'b', 10);
    memset(c, 'c', 10);
    puts(a);
    memset(c, 0xc3, 10);
    mprotect(c, 10, PROT_READ | PROT_EXEC);
    c[0] = 'H';
    char *v = mmap(0, 4096, PROT_READ | PROT_WRITE | PROT_EXEC, MAP_PRIVATE | MAP_ANONYMOUS, -1, 0);
    memset(v, 0xc3, 4096);
    void (*func) (void);
    func = v;
    func();
    free(a);
    free(b);
    free(c);
    return 0;
}


