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
    unsigned int uValue;
    int uNibble; 
    char sHexByte[3];
    sHexByte[2] = '\0'; 

    const char csHexChars[16] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    for(uValue = 0; uValue < 256U; uValue++)
    {
        // shifing right 4 bits and storing in uNibble.
        uNibble = (uValue & 0xFFU) >> 4U;
        sHexByte[0] = csHexChars[uNibble];
        // Taking Last 4bits from uValue and storing in uNibble. 
        uNibble = uValue & 0x0FU;
        sHexByte[1] = csHexChars[uNibble];
        // Putting : if value is greater than 0.
        if(uValue > 0)
            fprintf(stdout,":");
        fputs(sHexByte, stdout);
    }
    
    fprintf(stdout,"\n");
    // checking argument is space or not.
    if(argv[0][1] == ' ')
        return argc;
    // return 0 when argument is not space
    return 0;
}
