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
        val[count] = (unsigned char) ( 
            (hexstring[0] <= '9' ? hexstring[0] - '0' : toupper(hexstring[0]) - 'A' + 10) * 16  + 
            (hexstring[1] <= '9' ? hexstring[1] - '0' : toupper(hexstring[1]) - 'A' + 10)); 
        pos += 2; 
    } 
    printf ("0x"); 
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) 
        printf ("%02x", val[count]); 
    printf ("\n"); 
    return 0; 
}
