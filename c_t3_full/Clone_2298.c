int main (int argc, char *argv []) {
    char *home, *tmp2;
    home = strdup (getenv ("ORACLE_HOME"));
    tmp2 = strdup (getenv ("ORACLE_HOME"));
    home = realloc (home, strlen (home) +strlen ("A") + 1);
    tmp2 = realloc (tmp2, strlen (tmp2) +strlen ("B") + 1);
    strcat (home, "A");
    strcat (tmp2, "B");
}



 

int main (int argc, char *argv []) {
    char *usr1, *usr2;
    usr1 = strdup (getenv ("USER_NAME"));
    usr2 = strdup (getenv ("USER_NAME"));
    usr1 = realloc (usr1, strlen (usr1) +strlen ("K") + 1);
    usr2 = realloc (usr2, strlen (usr2) +strlen ("L") + 1);
    strcat (usr1, "K");
    strcat (usr2, "L");
}


