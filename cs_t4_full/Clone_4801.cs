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
    {
        while (_SeatStates.Count < Rows)
            _SeatStates.Add(new List<SeatState>());

        foreach(List<SeatState> r in _SeatStates)
        {
            while (r.Count < Columns)
                r.Add(SeatState.Empty);
            if (r.Count > Columns)
            {
                for (int i = r.Count - 1; i > Columns - 1; i--)
                    r.RemoveAt(i);
            }
        }
    }
    else if (_SeatStates.Count > Rows)
    {
        for (int r = _SeatStates.Count - 1; r > Rows - 1; r--)
            _SeatStates.RemoveAt(r);

        foreach (List<SeatState> c in _SeatStates)
        {
           
            while (c.Count < Columns)
                c.Add(SeatState.Empty);
            if (c.Count > Columns)
            {
                for (int i = c.Count - 1; i > Columns - 1; i--)
                    c.RemoveAt(i);
            }
        }
    }
    else
    {
        foreach (List<SeatState> c in _SeatStates)
        {
            while (c.Count < Columns)
                c.Add(SeatState.Empty);
            if (c.Count > Columns)
            {
                for (int i = c.Count - 1; i > Columns - 1; i--)
                    c.RemoveAt(i);
            }
        }
    }
}


