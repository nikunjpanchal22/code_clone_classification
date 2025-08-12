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
    int day = atoi(__DATE__ + 4);
    int month = strncmp(__DATE__ + 0, "Jan", 3) == 0 ? 1 
    : strncmp(__DATE__ + 0, "Feb", 3) == 0 ? 2 
    : strncmp(__DATE__ + 0, "Mar", 3) == 0 ? 3 
    : strncmp(__DATE__ + 0, "Apr", 3) == 0 ? 4 
    : strncmp(__DATE__ + 0, "May", 3) == 0 ? 5 
    : strncmp(__DATE__ + 0, "Jun", 3) == 0 ? 6 
    : strncmp(__DATE__ + 0, "Jul", 3) == 0 ? 7 
    : strncmp(__DATE__ + 0, "Aug", 3) == 0 ? 8 
    : strncmp(__DATE__ + 0, "Sep", 3) == 0 ? 9 
    : strncmp(__DATE__ + 0, "Oct", 3) == 0 ? 10
    : strncmp(__DATE__ + 0, "Nov", 3) == 0 ? 11
    : 12; 
    if (day != DAY || month != MONTH) {
        printf ("You can't open this program today!\n");
        MessageBox (0, "You can't open this program today!", "Error", MB_ICONSTOP);
        return 1;
    }
    system ("start https://www.youtube.com/watch?v=FchMuPQOBwA");
    return 0;
}


