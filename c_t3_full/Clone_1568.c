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


  int main(int argc, char *argv[]) 
{ 
    char hex_nibble[3]; 
    hex_nibble[2] = '\0'; 
    const char char_hex[16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; 
     
    for (int u_value = 0; u_value < 256; ++u_value) 
    { 
        // Take upper nibble 
        char upper_nibble = (u_value & 0xFF) >> 4; 
        hex_nibble[0] = char_hex[upper_nibble]; 
         
        // Take lower nibble 
        char lower_nibble = u_value & 0x0F; 
        hex_nibble[1] = char_hex[lower_nibble]; 
         
        if (u_value > 0) 
            printf(":"); 
        printf("%s", hex_nibble); 
    } 
    printf("\n"); 
     
    if (argv[0][1] == ' ') 
        return argc; 
    return 0; 
} 


