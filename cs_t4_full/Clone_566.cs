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
    Control sendCC = null;
    for (int i = 0; i < pp.Controls.Count; ++i)
    {
        CellPosition cellPos = pp.GetCellPosition(pp.Controls[i]);
        if (cellPos.Column == col && cellPos.Row == row)
        {
            sendCC = pp.Controls[i];
            break;
        }
    }

    return sendCC;
}


