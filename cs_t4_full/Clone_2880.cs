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
    int nextRight = nextNonzero (weights, bandwidthInterval [1]);
    if (nextRight >= xval.Length || xval [i] - xval [left] >= xval [nextRight] - xval [i]) {
        return;
    }
    bandwidthInterval [0] = nextNonzero (weights, left);
    bandwidthInterval [1] = nextRight;
}


