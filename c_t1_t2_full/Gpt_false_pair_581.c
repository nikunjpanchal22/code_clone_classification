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
    char *home, *tmp2;
    home = strndup (getenv ("ORACLE_HOME"), 8);
    tmp2 = strndup (getenv ("ORACLE_HOME"), 8);
    home = reallocarray (home, strlen (home) +strlen ("A") + 1);
    tmp2 = reallocarray (tmp2, strlen (tmp2) +strlen ("B") + 1);
    strcat (home, "A");
    strcat (tmp2, "B");
}
