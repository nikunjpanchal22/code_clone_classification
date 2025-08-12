int main () {
    FILE *fp = fopen ("sample", "r");
    unsigned char c1, c2;
    int i = 0;
    unsigned char sum, final_hex [FILELEN / 2];
    for (i = 0; i < FILELEN / 2; i++) {
        c1 = ascii_to_hex (fgetc (fp));
        c2 = ascii_to_hex (fgetc (fp));
        sum = c1 << 4 | c2;
        final_hex[i] = sum;
        printf ("%02x ", sum);
    }
    printf ("\n");
}


 
int main (){
    FILE *fp;
    unsigned char c1, c2;
    int i;
    unsigned char sum, final_hex [FILELEN / 2];
    fp = fopen("example.txt", "rb");
    if (fp) 
    {
        for (i = 0; i < FILELEN/2; i++) 
        {
            c1 = fgetc(fp);
            c2 = fgetc(fp);
            sum = (c1 & 0x0f) | (c2<<4);
            final_hex[i] = sum;
            printf("%02X ", sum);
        }
        printf("\n");
        fclose(fp);
    }
}


