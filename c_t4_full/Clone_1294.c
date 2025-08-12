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
    unsigned int addr = 4194624;
    for (int i=20; i>=0; i-=12) {
        printf("%d\n", f(addr, i, i+11));
    }
    return 0;
}


