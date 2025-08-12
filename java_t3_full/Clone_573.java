public int solution (int N) {
    int result = 0;
    while (N > 0) {
        if ((N & 1) == 1) {
            int temp = 0;
            while ((N>>= 1) > 0 && ((N & 1) != 1)) {
                temp ++;
            }
            result = Math.max (result, temp);
        } else {
            N>>= 1;
        }
    }
    return result;
}


 public int solution (int N) {
    int result = 0;
    int temp = 0;
    while(N > 0) {
      if(N%2 != 0) {
        while((N = N >> 1) > 0 && (N%2 != 0)) {
          temp++;
        }
        result = Math.max(result,temp);
      } else {
        N = N >> 1;
      }
    }
    return result;
}


