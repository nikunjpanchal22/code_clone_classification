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
        static const char hexChar[17] = "0123456789ABCDEF"; 
        val[count] = 0; 
        char c1 = *pos; 
        char c2 = *(pos + 1); 
        int i1 = 0; 
        for (int i = 0; i < 16; i++) { 
            if (c1 == hexChar[i]) { 
                i1 = i; 
            } 
        } 
        int i2 = 0; 
        for (int i = 0; i < 16; i++) { 
            if (c2 == hexChar[i]) { 
                i2 = i; 
            } 
        } 
        val[count] = (unsigned char) (16 * i1 + i2); 
        pos += 2; 
    }  
    printf ("0x"); 
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) 
        printf ("%02x", val[count]); 
    printf ("\n"); 
    return 0; 
}


