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


 private static void updateBandwidthInterval (double [] xval, int i, int [] bandwidthInterval) {
    // Get both of the next indexes
    int nextLeft = nextNonzero (weights, bandwidthInterval [0]);
    int nextRight = nextNonzero (weights, bandwidthInterval [1]);
    
    // If the next right index is smaller than the size of the 
    // array and the difference is smaller than the original 
    if (nextRight < xval.Length && xval [nextRight] - xval [i] < xval [i] - xval [bandwidthInterval[0]]) {
        // Update the left and right indexes with the new ones 
        bandwidthInterval [0] = nextLeft; 
        bandwidthInterval [1] = nextRight;
    }
}


