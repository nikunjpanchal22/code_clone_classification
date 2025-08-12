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


 int main(){
    char c_min = CHAR_MIN;
    char c_max = CHAR_MAX;
    unsigned char convert = '45';

    int one = '1';
    int fourtyFive = '45';
    int zero = '0';

    printf("The value for '1' is %d\n", one);
    printf("The value for '45' is %d\n", fourtyFive);
    printf("The value for '0' is %d\n", zero);
    printf("The minimum possible value for 'char' is %d\n", c_min);
    printf("The maximum possible value for 'char' is %d\n", c_max);
    printf("The value for '45' converted to an unsigned 'char' is %u\n", convert);

    return 0;
}


