int main (void) {
    char c_min = CHAR_MIN;
    char c_max = CHAR_MAX;
    unsigned char uc = '45';
    printf ("'1'=%d\n", '1');
    printf ("'45'=%d\n", '45');
    printf ("'0'=%d\n", '0');
    printf ("lowest possible value for char=%d\n", c_min);
    printf ("highest possible value for char=%d\n", c_max);
    printf ("'45' converted to an (unsigned) char=%u\n", uc);
    return 0;
}


 int main () {
    char min = CHAR_MIN;
    char max = CHAR_MAX;
    unsigned chars = '45';
    int n1 = '1';
    int n45 = '45';
    int n0 = '0';
    printf("'1'=%d\n", n1);
    printf("'45'=%d\n",n45);
    printf("'0'=%d\n",n0);
    printf("lowest possible value for char=%d\n", min);
    printf("highest possible value for char=%d\n", max);
    printf("'45' converted to an (unsigned) char=%u\n", chars);
    return 0;
}


