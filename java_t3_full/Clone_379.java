public int solution (int X, int [] A) {
    int size = A.length;
    int [] check = new int [X];
    int cmp = 0;
    int time = - 1;
    for (int x = 0;
    x < size; x ++) {
        int temp = A [x];
        if (temp <= X) {
            if (check [temp - 1] > 0) {
                continue;
            }
            check [temp - 1] ++;
            cmp ++;
        }
        if (cmp == X) {
            time = x;
            break;
        }
    }
    return time;
}


public int solution(int target, int[] array) {
	int length = array.length;
	boolean[] visited = new boolean[target];
	int count = 0; //count current reached number
	int index = -1;
	
	for (int i = 0; i < length; i++) {
		if(array[i] <=target && visited[array[i]-1] == false) {
			visited[array[i]-1] = true;
			count++;
			
			if(count == target) {
				index = i;
				break;
			}
		}
	} 
	return index; // -1 if not found
}


