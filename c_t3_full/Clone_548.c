int main () {
    char sentence [200];
    int left = 0;
    int right;
    printf ("Enter a message: ");
    fgets (sentence, sizeof sentence, stdin);
    right = strlen (sentence);
    while (1) {
        while (left < right && !(isalpha (sentence[left])))
            left++;
        while (right > left && !(isalpha (sentence[right])))
            right--;
        if (left >= right)
            break;
        else {
            if (toupper (sentence[left]) != toupper (sentence[right])) {
                printf ("Not a Palindrome\n");
                return 0;
            }
            left++;
            right--;
        }
    }
    printf ("Palindrome\n");
    return 0;
}


 int main(){ 
    char sentence[200];
    int left = 0;
    int right;
    printf("Enter a message: "); 
    fgets(sentence, sizeof sentence, stdin);
    right = strlen(sentence) - 1;

    while (left < right) {
        if (isalpha(sentence[left]) && isalpha(sentence[right])) {
            if (toupper(sentence[left++]) != toupper(sentence[right--]))  {
                printf("Not a Palindrome\n");
                return -1;
            }
        }
        else {
            if (!(isalpha(sentence[left])))
                left++;

            if (!(isalpha(sentence[right])))
                right--;
        }
    }
    printf("Palindrome\n");
    return 0;
}


