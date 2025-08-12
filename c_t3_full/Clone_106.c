int main (int argc, char **argv) {
    const char hexstring [] = "DEadbeef10203040b00b1e50", *pos = hexstring;
    unsigned char val [12];
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) {
        sscanf (pos, "%2hhx", & val [count]);
        pos += 2;
    }
    printf ("0x");
    for (size_t count = 0; count < sizeof val / sizeof *val; count++)
        printf ("%02x", val[count]);
    printf ("\n");
    return 0;
}



int main (int argc, char **argv) 
{ 
    const char hexstring [] = "DEadbeef10203040b00b1e50", *pos = hexstring; 
    unsigned char val [12]; 
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) { 
        char byteVal[3] = {'\0', '\0', '\0'}; 
        byteVal[0] = *pos; 
        byteVal[1] = *(pos + 1);  
        unsigned int byteValue; 
        sscanf(byteVal, "%x", &byteValue); 
        val[count] = (unsigned char) byteValue; 
        pos += 2; 
    } 
    printf ("0x"); 
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) 
        printf ("%02x", val[count]); 
    printf ("\n"); 
    return 0; 
}


