protected void btnNext_Click1 (object sender, EventArgs e) {
    DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter eobj = new DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter ();
    DataTable dt = new DataTable ();
    if (txtNextStep.Tag == null)
        dt = eobj.GetTicketFirstUpdate (txtSupportRef.Text);
    else
        dt = eobj.GetNextTicketUpdate (txtSupportRef.Text, (string) txtNextStep.Tag);
    if (dt.Rows.Count != 0) {
        txtNextStep.Text = dt.Rows [0] ["NextStep"].ToString ();
        txtNextStep.Tag = dt.Rows [0] ["Id"].ToString ();
    }
}


 protected void btnNext_Click1 (object sender, EventArgs e) {
    DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter eobj = new DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter ();
    DataTable dt = new DataTable ();

    if (txtNextStep.Tag == null){
        // retrieve the first ticket update
        dt = eobj.GetTicketFirstUpdate (txtSupportRef.Text);
        if(dt != null && dt.Rows.Count > 0) {
            txtNextStep.Text = dt.Rows[0]["NextStep"].ToString();
            txtNextStep.Tag = dt.Rows[0]["Id"].ToString();
        }else {
            // else return empty table object
            dt = new DataTable();
        }
    }else {
        // retrieve the next ticket update based on the current ticket ID
        dt = eobj.GetNextTicketUpdate(txtSupportRef.Text, (string)txtNextStep.Tag);
        if(dt != null && dt.Rows.Count > 0) {
            txtNextStep.Text = dt.Rows[0]["NextStep"].ToString();
            txtNextStep.Tag = dt.Rows[0]["Id"].ToString();
        }else {
            // else return empty table object
            dt = new DataTable();
        }
    }

}


