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
    int varA = 1048575, varB = 1048575;
    char buf[17], zeros_arr[] = "0000000000000000";
    sprintf(buf, "%x%x", varA, varB);
    int len = strlen(buf);
    zeros_arr[16 - ((len < 16) ? len : 0)] = 0x0;
    printf("%s%s\n", zeros_arr, buf);
    return 0;
}


