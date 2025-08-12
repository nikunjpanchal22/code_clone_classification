int main () {
    FILE *f = fopen ("test.txt", "r");
    char word [MAX_LENGTH];
    int length = strlen (word);
    int i, j, k, flag = 0;
    fgets (word, MAX_LENGTH, f);
    for (i = 0; i < length; i++) {
        if (word[i] == " ") {
            flag = 0;
            j = i;
            for (k = i; word[k] != " "; k++) {
                if (word[i] == 'a' | word[i] == 'e' | word[i] == 'i' | word[i] == 'o' | word[i] == 'u' | word[i] == 'y') {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                for (i = i; i <= k; i++)
                    printf ("%c", word[i]);
        }
    }
}


 int main(){
    FILE *f = fopen("test.txt", "r");
    char word[MAX_LENGTH];
    int length = strlen(word);
    int i, j, k, flag;
    fgets(word, MAX_LENGTH, f);
    for(i = 0; i < length; i++){
        if(word[i] == ' '){
            flag = 0;
            j = i;
            for(k = i; word[k]!= ' '; k++){
                if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u' || word[i] == 'y'){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                for(int x = i; x<= k; x++){
                   if(word[x] !='\0')
                        printf("%c", word[x]);
                }
            }
        }
    }
}


