int main () {
    int i = 0;
    int j = 1;
    char key [6] = "april", ckey [6];
    printf ("Enter the key: ");
    scanf ("%s", ckey);
    for (i = 0; i < 6; i++) {
        if (ckey[i] != key[i])
            j = 0;
    }
    if (j == 1)
        printf (% s, "Correct.")
    else
        printf (% s, "Wrong.")
    return 0;
}




#include <stdio.h>
int main()
{
    char key[6] = "april";
    char ckey[6];
    scanf("%s", ckey);
    if(key[0] == ckey[0] && key[1] == ckey[1] && key[2] == ckey[2] && key[3] == ckey[3] && key[4] == ckey[4])
        printf("Correct.");
    else
        printf("Wrong.");
    return 0;
}


