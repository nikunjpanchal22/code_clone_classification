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
    unsigned int uNibble = 0U; 
    char sHexByte [3]; 

    sHexByte[2] = '\0'; 
    const char csHexChars [16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 

    for (uValue = 0U; uValue < 256U; uValue++) 
    { 
        //Get upper 4 bits from existing 8 bits data and store in uNibble
        uNibble = (uValue & 0xFFU) >> 4U; 
        sHexByte[0] = csHexChars[uNibble];
         
        //Get Lower 4 bits from existing 8 bits data and store in uNibble.
        uNibble = uValue & 0x0FU; 
        sHexByte[1] = csHexChars[uNibble];
        
        //if uValue greater than 0, put char ':'
        if (uValue > 0) 
            printf (":"); 
         
        //Print sHexByte
        printf("%s", sHexByte);
    } 
    printf("\n");
    
    //check argument is space or not
    if (argv[0][1] == ' ') 
        return argc;
    return 0; 
}


