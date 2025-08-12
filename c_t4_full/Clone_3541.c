int main (void) {
    char username [16];
    char text [512];
    int ch, i;
    FILE *my_file = fopen ("inbox.txt", "r");
    while (1 == fscanf (my_file, "%15s%*c", username)) {
        i = 0;
        while (i < sizeof (text) - 1 && EOF != (ch = fgetc (my_file))) {
            if (ch == '\n' && i && text[i - 1] == '\n')
                break;
            text[i++] = ch;
        }
        text[i] = 0;
        printf ("user:%s\n", username);
        printf ("text:\n%s\n", text);
    }
    fclose (my_file);
    return 0;
}







#include <stdio.h>
#include <string.h>

int main(){
    char line[530];
    FILE *my_file = fopen("inbox.txt", "r");

    while(fgets(line, sizeof line, my_file)){
        char *username = strtok(line, " ");
        char *text = strtok(NULL, "");
        printf("user:%s\n", username);
        printf("text:\n%s\n", text);
    }

    fclose(my_file);
    return 0;
}


