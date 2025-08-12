private static void updateBandwidthInterval (double [] xval, int i, int [] bandwidthInterval) {
    int left = bandwidthInterval [0];
    int right = bandwidthInterval [1];
    int nextRight = nextNonzero (weights, right);
    if (nextRight < xval.Length && xval [nextRight] - xval [i] < xval [i] - xval [left]) {
        int nextLeft = nextNonzero (weights, bandwidthInterval [0]);
        bandwidthInterval [0] = nextLeft;
        bandwidthInterval [1] = nextRight;
    }
}


 private static void updateBandwidthInterval(double [] xval, int i, int [] bandwidthInterval){
    // Find the next 'left' or preceding index    
    int nextLeft = nextNonzero (weights, bandwidthInterval [0]);
    // Find the next 'right' or succeeding index
    int nextRight = nextNonzero (weights, bandwidthInterval [1]);
    
    // Check if the next 'right' index exists and 
    // if the difference of the elements is smaller
    if (nextRight < xval.Length && xval[nextRight] - xval[i] < xval[i] - xval[bandwidthInterval[0]]){ 
        bandwidthInterval[0] = nextLeft;  // Update left
        bandwidthInterval[1] = nextRight; // Update right
    }
}


