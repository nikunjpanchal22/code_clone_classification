protected void Unnamed1_Click (object sender, EventArgs e) {
    foreach (GridViewRow row in GridView1.Rows) {
        if (row.RowType == DataControlRowType.DataRow) {
            CheckBox cb = (CheckBox) row.FindControl ("ProductSelector");
            if (cb != null && cb.Checked) {
                int productID = Convert.ToInt32 (GridView1.DataKeys [row.RowIndex].Value);
                Response.Write (string.Format ("This would have deleted ProductID {0}<br />", productID));
            }
        }
    }
}





protected void Unnamed1_Click(object sender, EventArgs e)
{
	    var gridViewRows = GridView1.Rows;
	    foreach (GridViewRow row in gridViewRows)
	    {
		if (row.RowType == DataControlRowType.DataRow)
		{
		    var cb = (CheckBox)row.FindControl("ProductSelector");
		    if (cb == null || !cb.Checked) continue;
		    var productID = Convert.ToInt32(GridView1.DataKeys[row.RowIndex].Value);
		    Response.Write($"This would have deleted ProductID {productID}<br />");
		}
	    }
}


