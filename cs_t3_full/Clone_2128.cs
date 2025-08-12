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
    int left = bandwidthInterval [0];
    int right = bandwidthInterval [1];
    int nextRight = nextNonzero (weights, right);
    left = xval [i] - xval [left] < xval [nextRight] - xval [i] ? nextNonzero (weights, bandwidthInterval [0]) : left;
    right = xval [i] - xval [left] < xval [nextRight] - xval [i] ? nextRight : right;
    bandwidthInterval[0] = left;
    bandwidthInterval[1] = right; 
}


