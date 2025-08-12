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


 static bool Check2DArray (int [,] data, int [,] find) {
    int dataLen  = data.Length;
    int findLen = find.Length;
    int dataRows = data.GetLength(0);
    int dataCols = data.GetLength(1);
    int findRows = find.GetLength(0);
    int findCols = find.GetLength(1);
     
    for (int i = 0; i < dataLen; i++) {
        int dataX = i % dataRows;
        int dataY = i / dataRows;
        bool okay = true;
             
        for (int j = 0; j < findLen && okay; j++) {
            int findX = j % findCols;
            int findY = j / findRows;
            int checkedX = findX + dataX;
            int checkedY = findY + dataY;
                 
            if (checkedX >= dataCols || checkedY >= dataRows) {
                okay = false;
                break;
            }
            okay = data[checkedY, checkedX] == find[findY, findX];
        }
        if (okay)
            return true;
    }
    return false;
}


