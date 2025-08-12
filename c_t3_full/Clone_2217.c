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




#include<stdio.h>
#include<string.h>
#include<stdlib.h>

extern char* substring_enclosed_const(const char* str, const char* from, const char* to);
extern char* substring_enclosed(char* str, const char* from, const char* to);

int main() {
    const char str[] = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char str2[] = "+IPD,0,206:GET /setWifi:home:0545881255 HTTP/1.1  Host: 192.168.4.1";
    char* substr;
    substr = substring_enclosed_const(str, "GET /", " HTTP");
    if(substr) {
        puts(substr);
        free(substr);
    }
    substr = substring_enclosed(str2, "GET /", " HTTP");
    if(substr) {
        puts(substr);
    }
    return 0;
}


