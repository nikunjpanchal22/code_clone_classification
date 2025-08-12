int main () {
    char ch = 'g';
    char alp [26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    string enc [26] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
    for (int i = 0; i <= 25; i++) {
        if (ch == alp[i]) {
            printf(enc[i]);
        }
    }
    system ("PAUSE");
    return 0;
}


 
int main() {
    char ch = 'g';
    string enc[26] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" };

    switch (ch)
    {
    case 'a':
        printf(enc[0]);
        break;
    case 'b':
        printf(enc[1]);
        break;
    case 'c':
        printf(enc[2]);
        break;
    case 'd':
        printf(enc[3]);
        break;
    case 'e':
        printf(enc[4]);
        break;
    case 'f':
        printf(enc[5]);
        break;
    case 'g':
        printf(enc[6]);
        break;
    case 'h':
        printf(enc[7]);
        break;
    case 'i':
        printf(enc[8]);
        break;
    case 'j':
        printf(enc[9]);
        break;
    case 'k':
        printf(enc[10]);
        break;
    case 'l':
        printf(enc[11]);
        break;
    case 'm':
        printf(enc[12]);
        break;
    case 'n':
        printf(enc[13]);
        break;
    case 'o':
        printf(enc[14]);
        break;
    case 'p':
        printf(enc[15]);
        break;
    case 'q':
        printf(enc[16]);
        break;
    case 'r':
        printf(enc[17]);
        break;
    case 's':
        printf(enc[18]);
        break;
    case 't':
        printf(enc[19]);
        break;
    case 'u':
        printf(enc[20]);
        break;
    case 'v':
        printf(enc[21]);
        break;
    case 'w':
        printf(enc[22]);
        break;
    case 'x':
        printf(enc[23]);
        break;
    case 'y':
        printf(enc[24]);
        break;
    case 'z':
        printf(enc[25]);
        break;
    default:
        break;
    }
    system("PAUSE");
    return 0;
}


