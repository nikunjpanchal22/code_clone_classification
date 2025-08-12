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





#include <stdio.h>
#define FILELEN 100
unsigned char ascii_to_hex(char c);

int main() {
    FILE* fp = fopen("sample.doc", "r");
    unsigned char c1, c2;
    unsigned char sum, final_hex[FILELEN / 2];
    int i;
    if (fp) {
        for (i = 0; i<FILELEN / 2; i++) {
            c1 = ascii_to_hex(fgetc(fp));
            c2 = ascii_to_hex(fgetc(fp));
            sum = c1 << 4 | c2;
            final_hex[i] = sum;
            printf("%02x ", sum);
        }
        printf("\n");
        fclose(fp);
    }
    return 0;
}


