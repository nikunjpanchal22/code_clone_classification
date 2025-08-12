int main (void) {
    char filename [100];
    for (j = 0; j < 10; j++) {
        sprintf (filename, "C:\\playlist%d.txt", j + 1);
        string = fopen (filename, "w+t");
        fclose (string);
    }
    return 0;
}





#include<stdio.h>
int main()
{ 
    char filePath[100];
    FILE* fileID;
    for(int j = 0; j < 10; j++)
    { 
        sprintf(filePath, "C:\\playlist%d.txt", j + 1);
        fileID = fopen(filePath, "w+t");
        fclose(fileID);
    }
    return 0;
}


