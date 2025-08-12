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

int check_credentials(char *uname, char *passwd) {
    if ((strcmp(uname, "waw") == 0) && (strcmp(passwd, "wow") == 0)) {
        printf ("You have logged in\n");
        return 0;
    }
    printf ("Failed, please try again\n");
    return 1;
}


