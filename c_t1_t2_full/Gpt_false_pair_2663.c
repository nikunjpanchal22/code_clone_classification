int main () {
    char *hexstring = "deadbeef10203040b00b1e50";
    int i;
    unsigned int bytearray [12];
    uint8_t str_len = strlen (hexstring);
    for (i = 0; i < (str_len / 2); i++) {
        sscanf (hexstring + 2 * i, "%02x", & bytearray [i]);
        printf ("bytearray %d: %02x\n", i, bytearray [i]);
    }
    return 0;
}


int main () 
{ 
    char* hex_string = "deadbeef10203040b00b1e50"; 
    int i;
    unsigned int byte_array[12]; 
    uint8_t hex_str_len = strlen(hex_string); 
    
    for (i = 0; i < (hex_str_len / 2); i++) 
    { 
        sscanf(hex_string + 2 * i, "%02x", &byte_array[i]); 
        printf("Byte_Array %d: %02x\n", i, byte_array[i]); 
    } 
    return 0; 
}
