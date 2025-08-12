int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}


 int main() 
{ 
    FILE* fin = fopen("test.txt", "rt"); 
    int newCount = getFileData(fin, SongList, globalCounter);
    printf("**************** Song List ****************\n");
    for (int counter = 0; counter < newCount; counter++) 
    { 
        printf("%s, %s, %s \n", SongList[counter].title, SongList[counter].artist, SongList[counter].year);
    } 
    printf("**************************************************\n"); 
} 


