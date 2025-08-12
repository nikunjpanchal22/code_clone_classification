int main () {
    int y = 1980;
    int m = 2;
    int d = 5;
    int skip = 40;
    struct tm t = {0};
    t.tm_mday = d;
    t.tm_mon = m - 1;
    t.tm_year = y - 1900;
    t.tm_mday += skip;
    mktime (& t);
    char buffer [30];
    strftime (buffer, 30, "%Y-%m-%d", & t);
    puts (buffer);
}


int main() {
    int y = 1980;
    int m = 2;
    int d = 5;
    int skip = 40;
    struct tm t;
    t.tm_mday = d;
    t.tm_mon = m - 1;
    t.tm_year = y - 1900;
    t.tm_mday += skip;
    time_t currtime;
    currtime = mktime(&t);
    char buffer[30];
    strftime(buffer, 30, "%Y-%m-%d", &t);
    puts(buffer);
}
