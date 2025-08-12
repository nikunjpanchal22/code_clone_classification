int main () {
    short s1, s2, s3 = 0;
    unsigned int addr = 4194624;
    s1 = f (addr, 20, 31);
    s2 = f (addr, 8, 19);
    s3 = f (addr, 0, 7);
    printf ("%d\n", s1);
    printf ("%d\n", s2);
    printf ("%d\n", s3);
    return 0;
}




#define PRINT_SHORT(s) printf ("%d\n", s)

int main () {
    unsigned int addr = 4194624;
    short s1 = f (addr, 20, 31);
    PRINT_SHORT(s1);
    short s2 = f (addr, 8, 19);
    PRINT_SHORT(s2);
    short s3 = f (addr, 0, 7);
    PRINT_SHORT(s3);
    return 0;
}


