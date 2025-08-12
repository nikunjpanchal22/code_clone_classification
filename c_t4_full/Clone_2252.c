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





#include <stdio.h>
#include <dirent.h>

int main() {
    struct dirent *dir_entry_ptr;
    DIR *dir_ptr = opendir(".");
    while (NULL != (dir_entry_ptr = readdir(dir_ptr))) {
        if (dir_entry_ptr->d_name[0] != '.' && DT_DIR == dir_entry_ptr->d_type)
            fputs(dir_entry_ptr->d_name, stdout), putchar('\n');
    }
    closedir(dir_ptr);
}


