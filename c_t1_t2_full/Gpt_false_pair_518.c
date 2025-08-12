int main (void) {
    const char *meida = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char writeable [] = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char *substr;
    substr = substring_enclosed_const (meida, "GET /", " HTTP");
    if (substr != NULL) {
        puts (substr);
        free (substr);
    }
    substr = substring_enclosed (writeable, "GET /", " HTTP");
    if (substr != NULL)
        puts (substr);
    return 0;
}




int main (void) {
    const char *meida = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char writeable [] = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char *substr;
    substr = substring_enclosed_const (meida, "GET /", " HTTP");
    if (substr != NULL) {
        printf("%s\n",substr);
        free (substr);
    }
    substr = substring_enclosed (writeable, "GET /", " HTTP");
    if (substr != NULL)
        printf("%s\n",substr);
    return 0;
}
