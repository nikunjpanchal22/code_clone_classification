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
    int s1=0, s2=0, s3=0;
    unsigned int addr = 4194624;
    s1 = (addr >> 20) & 0xff;
    s2 = (addr >> 8) & 0xff;
    s3 = addr & 0xff;
    printf ("%d\n", s1);
    printf ("%d\n", s2);
    printf ("%d\n", s3);
    return 0;
}


