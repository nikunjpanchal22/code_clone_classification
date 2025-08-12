int main (void) {
    int month, day, year, day_number = 0;
    printf ("Enter a date in the form (01/02/1996): ");
    scanf ("%d/%d/%d", & month, & day, & year);
    switch (month) {
    case 1 :
        day_number = day;
        break;
    case 2 :
        day_number = 31 + day;
        break;
    case 3 :
        day_number = 59 + day;
        break;
    case 4 :
        day_number = 90 + day;
        break;
    case 5 :
        day_number = 120 + day;
        break;
    case 6 :
        day_number = 151 + day;
        break;
    case 7 :
        day_number = 181 + day;
        break;
    case 8 :
        day_number = 212 + day;
        break;
    case 9 :
        day_number = 243 + day;
        break;
    case 10 :
        day_number = 273 + day;
        break;
    case 11 :
        day_number = 304 + day;
        break;
    case 12 :
        day_number = 334 + day;
        break;
    }
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        if (month > 2)
            ++day_number;
    }
    printf ("day %d\n", day_number);
    return 0;
}


 
int main (void) {
    int month, day, year, day_number = 0;
    printf ("Enter a date in the form (01/02/1996): ");
    scanf ("%d/%d/%d", &month, &day, &year);

    for (int i = 0; i < month - 1; i++) {
        if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
            day_number += 31;
        } else if (i == 3 || i == 5 || i == 8 || i == 10) {
            day_number += 30;
        } else {
            day_number += 28;
        }
    }
    day_number += day;

    if (year % 4 == 0 && year % 100 != 0) {
        if (month > 2)
            ++day_number;
    } else if (year % 400 == 0) {
        ++day_number;
    }

printf ("day %d\n", day_number);
return 0;
}


