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


 private void ReDimSeatState () {
    for (int i = _SeatStates.Count; i < Rows; i++)
        _SeatStates.Add (new List<SeatState> ());
    foreach (List<SeatState> lst in _SeatStates) {
        while (lst.Count < Columns) 
            lst.Add (SeatState.Empty);
        if (lst.Count > Columns) 
            lst.RemoveRange (Columns - 1, lst.Count - Columns);
    }
    while (_SeatStates.Count > Rows) 
        _SeatStates.RemoveAt (_SeatStates.Count - 1);
}


