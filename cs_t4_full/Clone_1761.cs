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
     for (int currentRow = 0; currentRow < GridView1.Rows.Count; currentRow++)
        {
            if (GridView1.Rows[currentRow].RowType == DataControlRowType.DataRow)
            {
                CheckBox cb = (CheckBox)GridView1.Rows[currentRow].FindControl("ProductSelector");
                if (cb != null && cb.Checked)
                {
                    int productID = Convert.ToInt32(GridView1.DataKeys[currentRow].Value);
                    Response.Write(string.Format("This would have deleted ProductID {0}<br />", productID));
                }
            }
        }
}


