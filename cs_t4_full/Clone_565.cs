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

    var query = from cc in pp.Controls
                where (pp.GetCellPosition(cc).Column == col && pp.GetCellPosition(cc).Row == row)
                select cc;

    if (query.Any())
    {
        sendCC = query.First();
    } 

    return sendCC;
}


