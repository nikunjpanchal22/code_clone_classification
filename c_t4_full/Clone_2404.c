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
    int i = (1<<20)-1, j = (1<<20)-1;
    char buff[17], nullArray[] = "0000000000000000";
    sprintf(buff, "%x%x", i, j);
    int count = strlen(buff);
    nullArray[16 - ((count < 16) ? count : 0)] = 0x0;
    printf("%s%s\n", nullArray, buff);
    return 0;
}


