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
    char name [CSTR_MAX_LEN + 1];
    char key [CSTR_MAX_LEN + 1];
    printf ("Enter your name: ");
    scanf ("%s", name);
    printf ("Enter your key: ");
    scanf ("%s", key);
    if ((strcmp (name, "waw") == 0) && (strcmp (key, "wow") == 0)) {
        printf ("You have logged in\n");
    }
    else {
        printf ("Failed, please try again\n");
    }
    return 0;
}
