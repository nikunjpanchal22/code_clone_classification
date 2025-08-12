int main () {
    int len, a = 0, e = 0, i = 0, o = 0, u = 0, it;
    char string [10000];
    scanf ("%d", & len);
    scanf ("%s", string);
    for (it = 0; it < len; it++) {
        if (string[it] == 'a')
            a = 1;
        else if (string[it] == 'e')
            e = 1;
        else if (string[it] == 'i')
            i = 1;
        else if (string[it] == 'o')
            o = 1;
        else if (string[it] == 'u')
            u = 1;
    }
    if (a && e && i && o && u)
        printf ("YES\n");
    else
        printf ("NO\n");
    system ("PAUSE");
    return 0;
}


 int main() {
    int len, a = 0, e = 0, i = 0, o = 0, u = 0, it;
    char string[10000];
    scanf("%d", &len);
    scanf("%s", string);
    
    for(int j = 0; j < len; j++) {
        if(string[j] == 'a'){
            a = 1;
        }
        else if (string[j] == 'e'){
            e = 1;
        }
        else if (string[j] == 'i'){
            i = 1;
        }
        else if (string[j] == 'o'){
            o = 1;
        }
        else if (string[j] == 'u'){
            u = 1;
        }
    }
    if (a == 1 && e == 1 && i == 1 && o == 1 && u == 1) {
        printf("YES\n");
    }
    else {
        printf("NO\n");
    }
    return 0;
}


