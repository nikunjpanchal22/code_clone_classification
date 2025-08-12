int main () {
    SYSTEMTIME t;
    GetLocalTime (& t);
    if (t.wDay != DAY || t.wMonth != MONTH) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}


 int main () {
    time_t now;
    struct tm *current;

    now = time(NULL);
    current = localtime(&now);
 
    int day = current->tm_mday;
    int month = current->tm_mon + 1;
    if (day != DAY || month != MONTH) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}


