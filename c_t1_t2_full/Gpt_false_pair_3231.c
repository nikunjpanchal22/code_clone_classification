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


int main () {
    char uname [CSTR_MAX_LEN + 1];
    char passwd [CSTR_MAX_LEN + 1];
    printf ("Enter your username: ");
    scanf ("%s", uname);
    printf ("Enter your password: ");
    scanf ("%s", passwd);
    const char *u = "waw";
    const char *p = "wow";
    if ((strcmp (uname, u) == 0) && (strcmp (passwd, p) == 0)) {
        printf ("You have logged in\n");
    }
    else {
        printf ("Failed, please try again\n");
    }
    return 0;
}
