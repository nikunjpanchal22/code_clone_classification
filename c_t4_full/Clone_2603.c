int main (int argc, char *argv []) {
    uint32_t datetime = strtoul (argv[1], NULL, 16);
    uint16_t mydate = datetime >> 16;
    uint16_t mytime = datetime & 0xFFFF;
    int new_encoding = (mytime & 0x8000) != 0;
    time_t linuxSeconds = (mydate / 3);
    uint8_t third_Count = mydate % 3;
    if (new_encoding) {
        linuxSeconds += 8765;
    }
    else {
        linuxSeconds += 5843;
    }
    linuxSeconds *= 24;
    linuxSeconds *= 3600;
    linuxSeconds += (mytime & 0x7FFF);
    linuxSeconds += (third_Count * 28800);
    struct tm *mytm = gmtime (&linuxSeconds);
    int daydiff = 0, year;
    for (year = new_encoding ? 1994 : 1986; year <= mytm->tm_year + 1900; year++) {
        if (year < mytm->tm_year + 1900) {
            if (new_encoding) {
                if (!isleap (year)) {
                    daydiff--;
                }
            }
            else {
                if (year != (mytm->tm_year + 1900) && isleap (year)) {
                    daydiff++;
                }
            }
        }
    }
    if (mydate < 0x0003) {
        linuxSeconds += 86400;
    }
    else {
        linuxSeconds += daydiff * 86400;
    }
    printf (ctime (& linuxSeconds));
    printf (asctime (gmtime (& linuxSeconds)));
    return 0;
}





#include <stdlib.h>
#include <stdio.h>
#include <stdint.h>
#include <string.h>
#include <sys/time.h>

int main (int argc, char *argv []) {
    uint32_t datetime = strtoul(argv[1], NULL, 16);
    uint16_t date_part = datetime >> 16;
    uint16_t time_part = datetime;

    time_t seconds = date_part / 3;
    seconds += time_part & 0x8000 ? 8765 : 5843;
    seconds *= 24 * 60 * 60;
    seconds += time_part & 0x7fff;
    seconds += date_part % 3 * 8 * 60 * 60;

    struct tm *tm = gmtime(&seconds);
    for (int year = time_part & 0x8000 ? 1994 : 1986; year < tm->tm_year + 1900; ++year)
        if (!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
            seconds += 24 * 60 * 60;

    if (date_part < 3)
        seconds += 24 * 60 * 60;
    else
        seconds += (tm->tm_year + 1900 - 1986 - (time_part & 0x8000 ? 1994 : 1986)) * 24 * 60 * 60;

    char buf[256];
    strftime(buf, sizeof(buf), "%c", localtime(&seconds));
    printf("%s\n", buf);
    
    return 0;
}


