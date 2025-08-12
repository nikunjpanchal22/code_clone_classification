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


 int main(void)
{
    char c_min = CHAR_MIN;
    char c_max = CHAR_MAX;
    unsigned char uc = '45';
 
    int value1 = '1';
    int value2 = '45';
    int value3 = '0';
 
    printf("The ASCII value for '1' is %d\n", value1);
    printf("The ASCII value for '45' is %d\n", value2);
    printf("The ASCII value for '0' is %d\n", value3);
    printf("The lowest possible for a char is %d\n", c_min);
    printf("The highest possible for a char is %d\n", c_max);
    printf("The ASCII value for 45 converted to an (unsigned) char is %u\n", uc);
 
    return 0;
}


