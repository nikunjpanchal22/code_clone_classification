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
     int counter = 0;
        while (counter < GridView1.Rows.Count)
        {
            GridViewRow row = GridView1.Rows[counter];
            if (row.RowType == DataControlRowType.DataRow)
            {
                CheckBox cb = (CheckBox)row.FindControl("ProductSelector");
                if (cb != null && cb.Checked)
                {
                    int productID = Convert.ToInt32(GridView1.DataKeys[row.RowIndex].Value);
                    Response.Write(string.Format("This would have deleted ProductID {0}<br />", productID));
                }
            }
            counter = counter + 1;
        }
}


