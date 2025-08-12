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
    char *dir1, *dir2;
    dir1 = strdup (getenv ("PATH_DIR"));
    dir2 = strdup (getenv ("PATH_DIR"));
    dir1 = realloc (dir1, strlen (dir1) +strlen ("E") + 1);
    dir2 = realloc (dir2, strlen (dir2) +strlen ("F") + 1);
    strcat (dir1, "E");
    strcat (dir2, "F");
}


