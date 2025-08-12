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
    home = alloc_strdup (getenv ("ORACLE_HOME"));
    tmp2 = alloc_strdup (getenv ("ORACLE_HOME"));
    home = alloc_realloc (home, strlen (home) +strlen ("A") + 1);
    tmp2 = alloc_realloc (tmp2, strlen (tmp2) +strlen ("B") + 1);
    strcat (home, "A");
    strcat (tmp2, "B");
}
