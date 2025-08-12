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
    struct dirent *dir_entry;
    DIR *dir_path = opendir(".");
    do {
        dir_entry = readdir(dir_path);
        if (dir_entry && dir_entry->d_type == DT_DIR && dir_entry->d_name[0] != '.')
             printf("%s\n", dir_entry->d_name);    
    } while (dir_entry);
    closedir(dir_path);
}


