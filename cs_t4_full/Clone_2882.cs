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




private static void updateBandwidthInterval (double [] xval, int i, int [] bwInterval) {
    int nextRight = nextNonzero (weights, bwInterval [1]);
    if (nextRight < xval.Length && xval [nextRight] - xval [i] < xval [i] - xval [bwInterval [0]]) {
        bwInterval [0] = nextNonzero (weights, bwInterval [0]);
        bwInterval [1] = nextRight;
    } 
}


