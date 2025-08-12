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
    // Find the next 'left' or preceding index    
    int nextLeft = nextNonzero (weights, bandwidthInterval [0]);
    // Find the next 'right' or succeeding index
    int nextRight = nextNonzero (weights, bandwidthInterval [1]);
    
    // If the next 'right' is smaller than the index size of xval and the 
    // difference between xval[nextRight] and xval[i] is smaller than the 
    // difference between xval[i] and xval[left], 
    // then update the bandwidthInterval
    if (nextRight < xval.Length && xval [nextRight] - xval [i] < xval [i] - xval [left]) {
        bandwidthInterval [0] = nextLeft;
        bandwidthInterval [1] = nextRight;
    }
}


