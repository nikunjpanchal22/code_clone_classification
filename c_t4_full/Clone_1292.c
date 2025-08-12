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




int main () {
    short s[3] = {0};
    unsigned int addr = 4194624;
    s[0] = f (addr, 20, 31);
    s[1] = f (addr, 8, 19);
    s[2] = f (addr, 0, 7);
    printf ("%d\n", s[0]); printf ("%d\n", s[1]); printf ("%d\n", s[2]);
    return 0;
}


