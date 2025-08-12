int main () {
    char uname [CSTR_MAX_LEN + 1];
    char passwd [CSTR_MAX_LEN + 1];
    printf ("Enter your username: ");
    scanf ("%s", uname);
    printf ("Enter your password: ");
    scanf ("%s", passwd);
    if ((strcmp (uname, "waw") == 0) && (strcmp (passwd, "wow") == 0)) {
        printf ("You have logged in\n");
    }
    else {
        printf ("Failed, please try again\n");
    }
    return 0;
}



#include <stdio.h>
#include <string.h>

#define CSTR_MAX_LEN 100
int main() {
    char uname[CSTR_MAX_LEN +1], passwd[CSTR_MAX_LEN +1];
    puts("Enter your username and password: ");
    scanf("%s %s", uname, passwd);
    strcmp(uname, "waw") == 0 && strcmp(passwd, "wow") == 0 ?
    puts("You have logged in") : puts("Failed, please try again");
    return 0; 
}


