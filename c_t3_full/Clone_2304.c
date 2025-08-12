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
    char *srv1, *srv2;
    srv1 = strdup (getenv ("SERVER_NAME"));
    srv2 = strdup (getenv ("SERVER_NAME"));
    srv1 = realloc (srv1, strlen (srv1) +strlen ("M") + 1);
    srv2 = realloc (srv2, strlen (srv2) +strlen ("N") + 1);
    strcat (srv1, "M");
    strcat (srv2, "N");
}


