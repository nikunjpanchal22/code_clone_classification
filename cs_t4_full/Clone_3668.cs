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
	    for (int i = 0; i < GridView1.Rows.Count; i++)
	    {
		GridViewRow row = GridView1.Rows[i];
		if (row.RowType == DataControlRowType.DataRow)
		{
		    CheckBox cb = (CheckBox) row.FindControl("ProductSelector");
		    if (cb != null && cb.Checked)
		    {
		        int productID = Convert.ToInt32(GridView1.DataKeys[i].Value);
		        Response.Write($"This would have deleted ProductID {productID}<br />");
		    }
		}
	    }
}


