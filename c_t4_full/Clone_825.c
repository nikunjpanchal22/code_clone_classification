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


 int main (void) { 
    unsigned char u_char = '45'; 
    int value1 = '1'; 
    int value2 = '45'; 
    int value3 = '0'; 
    int char_min = SCHAR_MIN;     
    int charMax = UCHAR_MAX; 
    printf("'1'=%d\n", value1); 
    printf("'45'=%d\n", value2); 
    printf("'0'='%d\n", value3); 
    printf("Lowest possible value for char = %d\n", char_min); 
    printf("Highest possible value for char = %d\n", charMax); 
    printf("'45' converted to an (unsigned) char = %u\n", u_char); 
    return 0; 
} 


