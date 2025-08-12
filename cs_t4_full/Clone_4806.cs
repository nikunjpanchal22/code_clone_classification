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
    while (_SeatStates.Count < Rows)
        _SeatStates.Add(new List<SeatState>());

    for (int x = 0; x < _SeatStates.Count; x++)
    {
        for (int y = 0; y < Columns; y++)
        {
            if(_SeatStates[x].Count < y)
            {
                _SeatStates[x].Add(SeatState.Empty);
            }
        }

        while (_SeatStates[x].Count > Columns)
        {
            _SeatStates[x].RemoveAt(_SeatStates[x].Count);
        }
    }

    if (_SeatStates.Count > Rows)
    {
        _SeatStates.RemoveRange(_SeatStates.Count - 1, _SeatStates.Count - Rows);
    }

}


