private void ReDimSeatStates () {
    while (_SeatStates.Count < Rows)
        _SeatStates.Add (new List < SeatState > ());
    if (_SeatStates.First ().Count < Columns)
        foreach (var columnList in _SeatStates)
            while (columnList.Count < Columns)
                columnList.Add (SeatState.Empty);
    while (_SeatStates.Count > Rows)
        _SeatStates.RemoveAt (_SeatStates.Count - 1);
    if (_SeatStates.First ().Count > Columns)
        foreach (var columnList in _SeatStates)
            while (columnList.Count > Columns)
                columnList.RemoveAt (columnList.Count - 1);
}


 private void ReDimSeatStates()
{
    for (int i = _SeatStates.Count; i < Rows; i++)    //ensuring all rows are populated
        _SeatStates.Add(new List<SeatState>());

    foreach (var columnList in _SeatStates)
    {
        while (columnList.Count < Columns)  // ensuring columns are added to each row
            columnList.Add(SeatState.Empty);

        if (columnList.Count > Columns)    // removing those extra columns, if present
            for (int i = columnList.Count - 1; i > Columns - 1; i--)
                columnList.RemoveAt (i);
    }

    if (_SeatStates.Count > Rows)  //removing extra rows, if any
        for (int i = _SeatStates.Count - 1; i > Rows - 1; i--)
            _SeatStates.RemoveAt(i);
}


