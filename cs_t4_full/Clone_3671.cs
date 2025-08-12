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
	    GridView1.Rows.Cast<GridViewRow>().Where(row => row.RowType == DataControlRowType.DataRow)
		.Select(row => new 
		{
		    Row = row,
		    CheckBox = row.FindControl("ProductSelector") as CheckBox
		})
		.Where(t => t.CheckBox != null && t.CheckBox.Checked)
		.Select(t => Convert.ToInt32(GridView1.DataKeys[t.Row.RowIndex].Value))
		.ToList()
		.ForEach(productID => Response.Write($"This would have deleted ProductID {productID}<br />"));
}


