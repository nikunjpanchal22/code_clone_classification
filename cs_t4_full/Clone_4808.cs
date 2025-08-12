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


  private void ReDimSeatStates () {
    for (int i = _SeatStates.Count; i < Rows; i++)
        _SeatStates.Add(new List<SeatState>());
    for (int i = 0; i < _SeatStates.Count; i++) {
        for (int j = _SeatStates[i].Count; j < Columns; j++)
            _SeatStates[i].Add(SeatState.Empty);
        while(_SeatStates[i].Count > Columns)
            _SeatStates[i].RemoveAt(_SeatStates.Count - 1);
    }
    while (_SeatStates.Count > Rows)
        _SeatStates.RemoveAt(_SeatStates.Count - 1);
}


