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
    int var1 = 1048575;
    int var2 = 1048575;
    char buffer [17], tempBuffer[8];
    char zeros [] = "0000000000000000";
    sprintf (tempBuffer, "%x%x", var1, var2);
    int len = strlen (tempBuffer);
    for (int i = 0; i < 8; i++)
        buffer[i] = tempBuffer[i];
    if (len < 16) {
        zeros[16 - len] = 0x0;
    }
    else {
        zeros[0] = 0x0;
    }
    printf ("%s%s\n", zeros, buffer);
    return 0;
}
