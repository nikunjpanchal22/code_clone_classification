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
        int index = 0; 
        val[count] = 0; 
        while (pos[index] && index < 2) { 
            int c = pos[index]; 
            if ('0' <= c && c <= '9') 
                val[count] = val[count] * 16 + c - '0'; 
            else if ('a' <= c && c <= 'f') 
                val[count] = val[count] * 16 + c - 'a' + 10; 
            else if ('A' <= c && c <= 'F') 
                val[count] = val[count] * 16 + c - 'A' + 10; 
            index++; 
        } 
        pos += 2; 
    } 
    printf ("0x"); 
    for (size_t count = 0; count < sizeof val / sizeof *val; count++) 
        printf ("%02x", val[count]); 
    printf ("\n"); 
    return 0; 
} 


