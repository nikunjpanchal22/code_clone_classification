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


int main () {
    char *hexString = "deadbeef10203040b00b1e50";
    int i; 
    unsigned int byteArray[12];
    uint8_t strLength = strlen (hexString);
    for (i = 0; i < (strLength / 2); i++) {
        sscanf (hexString + 2 * i, "%02x", &byteArray[i]);
        printf("The %dth byte in the hex string is %02x.\n", i, byteArray[i]);
    }
    return 0;
}
