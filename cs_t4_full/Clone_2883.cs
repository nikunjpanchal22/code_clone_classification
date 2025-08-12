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
    if (nextNonzero (weights, bandwidthInterval[1]) < xval.Length && xval [i] - xval [bandwidthInterval[0]] > xval [nextNonzero (weights, bandwidthInterval[1])] - xval [i]) {
        int nextLeft = nextNonzero (weights, bandwidthInterval[0]);
        bandwidthInterval [0] = nextLeft;
        bandwidthInterval [1] = nextNonzero (weights, bandwidthInterval [1]);
    }
}


