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
#define FILE_LEN 100
extern unsigned char ascii_to_hex(char c);

int main() {
    FILE* filePtr = fopen("sample", "r");
    unsigned char c1, c2;
    unsigned char sum, final_hex[FILE_LEN / 2];
    int i = 0;
    while (i < FILE_LEN / 2) {
        c1 = ascii_to_hex(fgetc(filePtr));
        c2 = ascii_to_hex(fgetc(filePtr));
        sum = c1 << 4 | c2;
        final_hex[i] = sum;
        printf("%02x ", sum);
        i++;
    }
    printf("\n");
    fclose(filePtr);
    return 0;
}


