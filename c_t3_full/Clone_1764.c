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


 
int main () {
    char ch = 'g';
    char alp [26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    string enc [26] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"};
    int index = 0;
    
    while(index < 26) {
        if (ch == alp[index]) {
            printf(enc[index]);
            index++;
            break;
        }
        else {
            index++;
        }
    }
    system ("PAUSE");
    return 0;
}


