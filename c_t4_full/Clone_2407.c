int main () {
    int var1 = 1048575;
    int var2 = 1048575;
    char buffer [17];
    char zeros [] = "0000000000000000";
    sprintf (buffer, "%x%x", var1, var2);
    int len = strlen (buffer);
    if (len < 16) {
        zeros[16 - len] = 0x0;
    }
    else {
        zeros[0] = 0x0;
    }
    printf ("%s%s\n", zeros, buffer);
    return 0;
}




int main () {
    int num1 = 1<<20 | 1<<19, num2 = 1<<20 | 1<<19;
    char buf[17], nulls[17] = "0000000000000000";
    sprintf(buf, "%x%x", num1, num2);
    nulls[16 - ((strlen(buf) < 16) ? strlen(buf) : 0)] = 0x0;
    printf("%s%s\n", nulls, buf);
    return 0;
}


