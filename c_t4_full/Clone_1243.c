int main (void) {
    char *str = "12 45 16 789 99";
    char *end = str;
    int numbers [MAX_NUMBERS];
    int i, count = 0;
    for (i = 0; i < MAX_NUMBERS; i++) {
        numbers[i] = (int) strtol (end, &end, 10);
        count++;
        if (*end == '\0')
            break;
    }
    for (i = 0; i < count; i++) {
        printf ("%d\n", numbers [i]);
    }
    return 0;
}





int main() {
		  char *str = "12 45 16 789 99";
		  char *end = str;
		  int num[MAX_NUMBERS];
		  int i=0, count=0;

		  while(*end != '\0'){
		    num[i++] = (int) strtol(end, &end, 10);
		    count++;
		    while(*end == ' ') end++;
		    if (*end == '\0') break;
		  }
}


