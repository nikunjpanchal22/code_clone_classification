private static void printPath (int [] [] mat, int i, int j) {
    if (mat.length == 0 || mat [0].length == 0) {
        System.out.println ("Empty matrix");
        return;
    }
    System.out.println ("(" + i + "," + j + ")");
    int rightValue = i >= 0 && i < mat.length - 1 && mat [i] [j] < mat [i + 1] [j] ? mat [i + 1] [j] : mat [i] [j];
    int belowValue = j >= 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j + 1] ? mat [i] [j + 1] : mat [i] [j];
    int aboveValue = i > 0 && i < mat.length - 1 && mat [i] [j] < mat [i - 1] [j] ? mat [i - 1] [j] : mat [i] [j];
    int leftValue = j > 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j - 1] ? mat [i] [j - 1] : mat [i] [j];
    if (rightValue > leftValue) {
        if (rightValue > belowValue) {
            if (rightValue > aboveValue) {
                printPath (mat, i + 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        } else {
            if (belowValue > aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        }
    } else {
        if (leftValue > belowValue) {
            if (leftValue > aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        } else {
            if (belowValue > aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        }
    }
}


private static void printPath (int [] [] mat, int i, int j) {
    if (mat.length == 0 || mat [0].length == 0) {
        System.out.println ("Empty matrix");
        return;
    }
    System.out.println ("(" + i + "," + j + ")");
    int rightValue = i >= 0 && i < mat.length - 1 && mat [i] [j] < mat [i + 1] [j] ? mat [i + 1] [j] : mat [i] [j];
    int belowValue = j >= 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j + 1] ? mat [i] [j + 1] : mat [i] [j];
    int aboveValue = i > 0 && i < mat.length - 1 && mat [i] [j] < mat [i - 1] [j] ? mat [i - 1] [j] : mat [i] [j];
    int leftValue = j > 0 && j < mat [0].length - 1 && mat [i] [j] < mat [i] [j - 1] ? mat [i] [j - 1] : mat [i] [j];
    if (rightValue >= belowValue) {
        if (rightValue >= leftValue) {
            if (rightValue >= aboveValue) {
                printPath (mat, i + 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        } else {
            if (leftValue >= aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        }
    } else {
        if (belowValue >= leftValue) {
            if (belowValue >= aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        } else {
            if (leftValue >= aboveValue) {
                printPath (mat, i - 1, j);
            } else {
                printPath (mat, i, j + 1);
            }
        }
    }
}
