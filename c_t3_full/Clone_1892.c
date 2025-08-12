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


 int main(void){
    char cMin = CHAR_MIN;
    char cMax = CHAR_MAX;
    unsigned char uChar = '45';
    int ascii1 = '1';
    int ascii45 = '45';
    int ascii0 = '0';
 
    printf("ASCII value of '1' = %d\n", ascii1);
    printf("ASCII value of '45' = %d\n", ascii45);
    printf("ASCII value of '0' = %d\n", ascii0);
    printf("Lowest possible character value = %d\n", cMin);
    printf("Highest possible character value = %d\n", cMax);
    printf("Character '45' converted to an unsigned character value = %u\n", uChar);

    return 0;
}


