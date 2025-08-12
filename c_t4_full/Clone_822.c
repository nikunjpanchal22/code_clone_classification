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
    int min = CHAR_MIN;
    int max = CHAR_MAX;
    char thirtyFive = '45';
    int ascii_one = '1';
    int ascii_fourtyFive = '45';
    int ascii_zero ='0';
    printf("Character '1' ASCII value is %d\n", ascii_one);
    printf("Character '45' ASCII value is %d\n", ascii_fourtyFive);
    printf("Character '0' ASCII value is %d\n", ascii_zero);
    printf("Lowest character value is %d\n", min);
    printf("Highest character value is %d\n", max);
    printf("Character '45' converted to unsigned char is %u\n", thirtyFive);
    return 0;
}


