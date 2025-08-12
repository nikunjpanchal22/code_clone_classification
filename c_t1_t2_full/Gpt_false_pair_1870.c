int main (int argc, char *argv []) {
    unsigned int uValue;
    unsigned int uNibble;
    char sHexByte [3];
    sHexByte[2] = '\0';
    const char csHexChars [16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    for (uValue = 0; uValue < 256U; uValue++) {
        uNibble = (uValue & 0xFFU) >> 4U;
        sHexByte[0] = csHexChars[uNibble];
        uNibble = uValue & 0x0FU;
        sHexByte[1] = csHexChars[uNibble];
        if (uValue > 0)
            putchar (':');
        fputs (sHexByte, stdout);
    }
    putchar ('\n');
    if (argv[0][1] == ' ')
        return argc;
    return 0;
}


 int main (int argc, char *argv[]) 
{ 
    unsigned int uVal;
    unsigned int uNib;
    char sHexByte [3];
    sHexByte[2] = '\0'; 
    const char csHexChars [16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 
 
    for (uVal=0; uVal<256U; uVal++)
    {
        //shift upper 4 bits from existing 8 bit data and store in uNibble
        uNib = (uVal & 0xFFU) >> 4U;
        sHexByte[0] = csHexChars[uNib];  
         
        //Take Last 4 bits from existing 8 bit data and store in uNibble
        uNib = uVal & 0x0FU;
        sHexByte[1] = csHexChars[uNib];  
         
        //Put ':' if value greater than 0
        if (uVal > 0) 
            printf(":"); 
        printf("%s", sHexByte);  
    } 
    printf("\n"); 
    // check argument is space or not
    if (argv[0][1] == ' ') 
        return argc;
    return 0; 
}
