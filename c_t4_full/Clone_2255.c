int main (void) {
    DIR *dirp;
    struct dirent *dp;
    dirp = opendir (".");
    while ((dp = readdir (dirp)) != NULL) {
        if (dp->d_type & DT_DIR) {
            if (dp->d_name[0] != '.')
                printf ("%s\n", dp->d_name);
        }
    }
    closedir (dirp);
    return 0;
}



 

#include <dirent.h>
#include <stdio.h>

int main() {
    struct dirent *entry;
    DIR *directory = opendir(".");
    for (entry = readdir(directory); entry != NULL; entry = readdir(directory))    {
        if (entry->d_name[0] != '.' && DT_DIR == entry->d_type)
            printf("%s\n", entry->d_name);
    }
    closedir(directory);
}


