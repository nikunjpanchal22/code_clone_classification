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
    if(_SeatStates.Count < Rows)
    {
        while(_SeatStates.Count < Rows)
            _SeatStates.Add(new List<SeatState>());
    }
    if(_SeatStates.Count > Rows)
    {
        while(_SeatStates.Count > Rows)
            _SeatStates.RemoveAt(_SeatStates.Count-1);
    }
    foreach (var columnList in _SeatStates)
    {
        if (columnList.Count > Columns)
        {
            for (int i = Columns - 1; i < columnList.Count; i++)
            {
                columnList.RemoveAt(i);
            }
        }
        if (columnList.Count < Columns)
        {
            for (int i = columnList.Count; i < Columns; i++)
            {
                columnList.Add(SeatState.Empty);
            }
        }
    }
}


