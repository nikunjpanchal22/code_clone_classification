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




#include<stdio.h>
int main(){
    char s[100];
    scanf("%s",s);
    if(s[0]=='a' && s[1]=='p' && s[2]=='r' && s[3]=='i' && s[4]=='l')
        printf("Correct.");
    else
        printf("Wrong.");
    return 0;
}


