int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}





typedef struct {
		  char line[256];
		} Song;
		Song songList[256];

		int main () {
		  FILE* fin = fopen("test.txt", "r");
		  int counter = 0;
		  while(fgets(songList[counter].line, sizeof(songList[counter].line), fin)) {
		    puts(songList[counter].line);
		    counter++;
		  }
		  fclose(fin);
}


