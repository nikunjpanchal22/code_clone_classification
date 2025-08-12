int main () {
    FILE *fin = fopen ("test.txt", "rt");
    int newCount = getFileData (fin, SongList, globalCounter);
    int counter = 0;
    while (counter < newCount) {
        printf ("%s, %s, %s", SongList [counter].title, SongList [counter].artist, SongList [counter].year);
        counter++;
    }
}





#define SIZE 1000
typedef struct {
		  char title[256];
		  char artist[256];
		  char year[256];
		} Song;
		Song songList[SIZE];

		int main () {
		  FILE *fin = fopen("test.txt", "rt");
		  fread(songList, sizeof(Song), SIZE, fin);
		  
		  for(int i = 0; i < SIZE; i++) {
		    printf("%s, %s, %s", songList[i].title, songList[i].artist, songList[i].year);
		  }
}


