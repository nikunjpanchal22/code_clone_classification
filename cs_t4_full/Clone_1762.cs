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


 protected void Unnamed1_Click (object sender, EventArgs e) {
     for (var numRows=0; numRows < GridView1.Rows.Count; numRows++)
        {
            if (GridView1.Rows[numRows].RowType == DataControlRowType.DataRow)
            {
                CheckBox cb = (CheckBox)GridView1.Rows[numRows].FindControl("ProductSelector");
                if (cb != null && cb.Checked)
                {
                    int productID = Convert.ToInt32(GridView1.DataKeys[numRows].Value);
                    Response.Write(string.Format("This would have deleted ProductID {0}<br />", productID));
                }
            }
        }
}


