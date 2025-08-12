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
    if (_SeatStates.Count < Rows)
        while (_SeatStates.Count < Rows)
            _SeatStates.Add(new List<SeatState>());

    foreach (var columnList in _SeatStates)
    {
        if (columnList.Count < Columns)
            while (columnList.Count < Columns)
                columnList.Add(SeatState.Empty);
        if (columnList.Count > Columns)
            for (int i = Columns - 1; i < columnList.Count; i++)
                columnList.RemoveAt(i);
    }
    if (_SeatStates.Count > Rows)
        while (_SeatStates.Count > Rows)
            _SeatStates.RemoveAt(_SeatStates.Count - 1);
}


