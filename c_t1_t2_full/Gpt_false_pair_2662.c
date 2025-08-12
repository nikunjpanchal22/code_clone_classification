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


int main() 
{
    char *hexstr = "deadbeef10203040b00b1e50";
	int i;
	unsigned int byte_array[12];
	uint8_t hex_len = strlen(hexstr);
	
	for (i = 0;i < (hex_len / 2);i++) {
		sscanf(hexstr + 2 * i, "%02x", &byte_array[i]);
		printf("byte_array %d: %02x\n", i, byte_array[i]);
	}
	
	return 0;
}
