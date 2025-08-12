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
    int a = 1048575, b = 1048575;
    char buff[17], zero[17] = "0000000000000000";
    sprintf(buff, "%x%x", a, b);
    int length = strlen(buff);
    zero[16 - ((length < 16) ? length : 0)] = 0x0;
    printf("%s%s\n", zero, buff);
    return 0;
}


