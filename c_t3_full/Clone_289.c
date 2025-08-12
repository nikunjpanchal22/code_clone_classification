int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL) {
        return 1;
    }
    int nr = atoi (second_part);
    printf ("%d\n", nr);
    return 0;
}


 int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL) {
        return 1;
    }
    int nums[4]; 
    for (int i = 0; i < strlen(second_part); i++){
        nums[i] = second_part[i] - '0';
    }
    int nr = (nums[0]*1000)+(nums[1]*100)+(nums[2]*10)+nums[3];
    printf ("%d\n", nr);
    return 0;
}


