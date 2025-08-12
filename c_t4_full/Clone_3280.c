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

void extract(char *str, char *out, int o)
{
            int j = 0;
            for (int i = o; str[i] != 0; i += 2)
                out[j++] = str[i];
            out[j] = '\0';
        }

        int main(void)
        {
            char str[41], odd[21], even[21];
            scanf("%s",str);
            extract(str, odd, 0);
            extract(str, even, 1);
            printf("%s\n %s\n ",odd,even);
            return 0;
}


