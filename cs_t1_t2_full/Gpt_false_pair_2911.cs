static bool Check2DArray (int [,] data, int [,] find) {
    int dataLen = data.Length;
    int findLen = find.Length;
    for (int i = 0; i < dataLen; i ++) {
        int dataX = i % data.GetLength (0);
        int dataY = i / data.GetLength (0);
        bool okay = true;
        for (int j = 0; j < findLen && okay; j ++) {
            int findX = j % find.GetLength (1);
            int findY = j / find.GetLength (1);
            int checkedX = findX + dataX;
            int checkedY = findY + dataY;
            if (checkedX >= data.GetLength (0) || checkedY >= data.GetLength (1)) {
                okay = false;
                break;
            }
            okay = data [dataY + findY, dataX + findX] == find [findY, findX];
        }
        if (okay)
            return true;
    }
    return false;
}


static bool Check2DArrayType4 (int [,] data, int [,] find) {
    int dataLen = data.Length;
    int findLen = find.Length;
    for (int i = 0; i < dataLen; i ++) {
        int dataX = i % data.GetLength (1);
        int dataY = i / data.GetLength (1);
        bool okay = true;
        for (int j = 0; j < findLen && okay; j ++) {
            int findX = j % find.GetLength (0);
            int findY = j / find.GetLength (0);
            int checkedX = findX + dataX;
            int checkedY = findY + dataY;
            if (checkedX >= data.GetLength (1) || checkedY >= data.GetLength (0)) {
                okay = false;
                break;
            }
            okay = data [dataX + findX, dataY + findY] == find [findX, findY];
        }
        if (okay)
            return true;
    }
    return false;
}
