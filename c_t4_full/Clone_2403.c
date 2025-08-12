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
    int v1 = 1<<20 - 1, v2 = 1<<20 - 1;
    char buffer[17], zeroArr[] = "0000000000000000";
    sprintf(buffer, "%x%x", v1, v2);
    int len = strlen(buffer);
    zeroArr[16 - ((len < 16) ? len : 0)] = 0x0;
    printf("%s%s\n", zeroArr, buffer);
    return 0;
}


