int computeHeight () {
    int maxHeight = 0;
    int [] heights = new int [parent.length];
    for (int vertex = 0;
    vertex < n; vertex ++) {
        if (heights [vertex] != 0) continue;
        int height = 0;
        for (int i = vertex;
        i != - 1; i = parent [i]) {
            if (heights [i] != 0) {
                height += heights [i];
                break;
            }
            height ++;
        }
        maxHeight = Math.max (maxHeight, height);
        for (int i = vertex;
        i != - 1; i = parent [i]) {
            if (heights [i] != 0) break;
            heights [i] = height --;
        }
    }
    return maxHeight;
}


 int computeHeight () {
    int maxHeight = 0;
    int [] elevations = new int [parent.length];
    for (int vertex = 0;
    vertex < n; vertex ++) {
        if (elevations [vertex] != 0) continue;
        int elevation = 0;
        for (int i = vertex;
        i != - 1; i = parent [i]) {
            if (elevations [i] != 0) {
                elevation += elevations [i];
                break;
            }
            elevation ++;
        }
        maxHeight = Math.max (maxHeight, elevation);
        for (int i = vertex;
        i != - 1; i = parent [i]) {
            if (elevations [i] != 0) break;
            elevations [i] = elevation --;
        }
    }
    return maxHeight;
}
