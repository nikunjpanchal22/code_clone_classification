public static Control GetAnyControlAt (TableLayoutPanel pp, int col, int row) {
    bool fnd = false;
    Control sendCC = null;
    foreach (Control cc in pp.Controls) {
        if (pp.GetCellPosition (cc).Column == col) {
            if (pp.GetCellPosition (cc).Row == row) {
                sendCC = cc;
                fnd = true;
                break;
            }
        }
    }
    if (fnd == true) {
        return sendCC;
    } else {
        return null;
    }
}


 public static Control GetAnyControlAt(TableLayoutPanel pp, int col, int row)
{
    foreach (Control cc in pp.Controls)
    {
        CellPosition cellPos = pp.GetCellPosition(cc);
        if (cellPos.Column == col &&  cellPos.Row == row)
        {
            return cc;
        }
    }

    return null;
}


