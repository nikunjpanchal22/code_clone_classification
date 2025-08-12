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
    // Get the next left index
    int nextLeft = nextNonzero (weights, bandwidthInterval [0]);
    // Get the next right index
    int nextRight = nextNonzero (weights, bandwidthInterval [1]);
    
    // Check if the next right index is smaller than the 
    // array size of xval and if the difference is smaller
    if (nextRight < xval.Length && xval [nextRight] - xval [i] < xval [i] - xval [bandwidthInterval[0]]) { 
        // Update the left and right indexes
        bandwidthInterval [0] = nextLeft;
        bandwidthInterval [1] = nextRight;
    }
}


