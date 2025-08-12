int main (void) {
    char str [41];
    char odd [21];
    char even [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Enter a string (40 characters maximum): ");
    scanf ("%s", str);
    while (i < strlen (str)) {
        if (i % 2 == 0) {
            odd[j++] = str[i];
        }
        else {
            even[k++] = str[i];
        }
        i++;
    }
    odd[j] = '\0';
    even[k] = '\0';
    printf ("The even string is:%s\n ", even);
    printf ("The odd string is:%s\n ", odd);
    return 0;
}





#include <stdio.h>
#include <string.h>
void extract_chars(char* src, char* dst, int start) {
            int j = 0;
            for (int i = start; src[i]; i += 2) {
                dst[j++] = src[i];
            }
            dst[j] = '\0';
        }
        int main() {
            char str[41], odd[21], even[21];
            fgets(str, sizeof(str), stdin);
            str[strcspn(str, "\n")] = '\0';
            extract_chars(str, odd, 0);
            extract_chars(str, even, 1);
            printf("%s\n%s\n", odd, even);
            return 0;
}


