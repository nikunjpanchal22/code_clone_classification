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

#define USER_NAME "waw"
#define PASSWORD "wow"
#define MAX_LEN 100

int main(){
    char uname[MAX_LEN+1], passwd[MAX_LEN+1];
    printf("Enter your username: ");
    scanf("%s",uname);
    printf("Enter your password: ");
    scanf("%s",passwd);
    if((!strcmp(uname,USER_NAME)) && (!strcmp(passwd,PASSWORD)))
        printf("You have logged in\n");
    else
        printf("Failed, please try again\n");
    return 0;
}


