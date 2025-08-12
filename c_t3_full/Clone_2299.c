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
    char *ip1, *ip2;
    ip1 = strdup (getenv ("API_IP"));
    ip2 = strdup (getenv ("API_IP"));
    ip1 = realloc (ip1, strlen (ip1) +strlen ("C") + 1);
    ip2 = realloc (ip2, strlen (ip2) +strlen ("D") + 1);
    strcat (ip1, "C");
    strcat (ip2, "D");
}


