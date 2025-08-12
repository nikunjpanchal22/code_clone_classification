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


 int main (int argc, char *argv[ ]) 
{ 
    unsigned int uValue = 0U;
    unsigned char uNibble = 0U; 
    char sHexByte [3]; 
    sHexByte[2] = '\0'; 
    const char csHexChars [16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    for (uValue = 0U; uValue < 256U; uValue++)
    {
        /*shift the upper 4 bits from 8 bit data and store in uNibble*/
        uNibble = (uValue & 0xFFU) >> 4U; 
        sHexByte[0] = csHexChars[uNibble];
         
        /* Taking last 4 bits of 8 bit data and store in uNibble*/
        uNibble = uValue & 0x0FU; 
        sHexByte[1] = csHexChars[uNibble]; 
        
        // Put : symbol if value greater than 0
        if (uValue > 0) 
            printf(":"); 
        fputs (sHexByte, stdout); 
    } 
    printf("\n"); 
    //Check argument is space
    if (argv[0][1] == ' ') 
        return argc;
    return 0; 
}
