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
    int nextRight = nextNonzero(weights,bandwidthInterval[1]);
    int nextLeft = nextNonzero(weights,bandwidthInterval[0]);
    
    //Check if the difference in elements is smaller 
    if(nextRight < xval.Length && (xval[nextRight] - xval[i]) < (xval[i] - xval[nextLeft])) {
        bandwidthInterval[0] = nextLeft; // Replace left with the next left  
        bandwidthInterval[1] = nextRight; // Replace right with the next right
    }
}


