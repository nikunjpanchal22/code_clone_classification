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





#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdint.h>

int main(int argc, char *argv []) {
    uint32_t datetime = strtoul(argv[1], NULL, 16);

    uint16_t date_part = datetime >> 16;
    uint16_t time_part = datetime & 0xFFFF;

    time_t seconds = (date_part / 3) * (24 * 3600);
    seconds += (time_part & 0x8000) ? 0x222D000 : 0x16A3000;
    seconds += (time_part & 0x7FFF);
    seconds += (date_part % 3 * 8 * 3600);

    int yearInit = (time_part & 0x8000) ? 1994 : 1986;
    int yearEnd = localtime(&seconds)->tm_year + 1900;
    int daydiff = 0;

    for (int yearIdx=yearInit; yearIdx < yearEnd; yearIdx++) {
        if (((yearIdx % 4 == 0) && (yearIdx % 100 != 0)) || (yearIdx % 400 == 0)) {
            daydiff -= time_part & 0x8000 ? 1 : -1;
        } else {
            daydiff += time_part & 0x8000 ? 1 : -1;
        }
    }

    if (date_part < 0x0003) {
        seconds += (24 * 3600);
    } else {
        seconds += (daydiff * 24 * 3600);
    }

    puts(ctime(&seconds));
    puts(asctime(gmtime(&seconds)));

    return 0;
}


