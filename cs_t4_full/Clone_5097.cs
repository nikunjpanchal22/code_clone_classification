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


 protected void btnNext_Click1 (object sender, EventArgs e) 
{
     DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter eobj = new DAL.TicketsDataSetTableAdapters.TicketDetailsTableAdapter();
     DataTable dt = new DataTable();

     if (string.IsNullOrEmpty(txtNextStep.Tag))
     {
         dt = eobj.GetTicketFirstUpdate(txtSupportRef.Text); 
      } 
      else
      {
          dt = eobj.GetNextTicketUpdate(txtSupportRef.Text, txtNextStep.Tag.ToString());
      }
      if (dt.Rows.Count != 0) 
      {
          txtNextStep.Text = Convert.ToString(dt.Rows[0]["NextStep"]);
          txtNextStep.Tag = Convert.ToString(dt.Rows[0]["Id"]); 
      } 
 }


