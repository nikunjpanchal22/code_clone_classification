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
    var res = pp.Controls.Where(x => pp.GetCellPosition(x).Column == col && pp.GetCellPosition(x).Row == row).FirstOrDefault();
    if (res != null)
    {
        sendCC = res;
    }

    return sendCC;
}


