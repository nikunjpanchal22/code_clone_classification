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
int main()
{
    char str[41], odd[21] = "", even[21] = "";
    gets(str);
    for (int i = 0; str[i]; i++) {
        strcat(i % 2 ? even : odd, (char[2]){str[i], '\0'});
    }
    printf("%s\n%s\n", odd, even);
    return 0;
}


