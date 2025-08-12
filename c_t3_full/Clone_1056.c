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


  int main(void) {
    DIR *directory;
    struct dirent *entry;
    directory = opendir(".");
    if (directory) {
        printf("Directories:\n");
        while ((entry=readdir(directory)) != NULL) {
            if (entry->d_type & DT_DIR) {
                if (strcmp(entry->d_name,".")!=0 && strcmp(entry->d_name,"..")!=0) {
                    printf("%s\n",entry->d_name);
                }
            }
        }
        closedir(directory);
    } else {
        printf("Error opening path");
    }
    return 0;
}


