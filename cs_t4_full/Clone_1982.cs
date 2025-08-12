private void SaveFileToDatabase (string filePath) {
    String strConnection = "Data Source=.\\SQLEXPRESS;AttachDbFilename='C:\\Users\\Hemant\\documents\\visual studio 2010\\Projects\\CRMdata\\CRMdata\\App_Data\\Database1.mdf';Integrated Security=True;User Instance=True";
    String excelConnString = String.Format ("Provider=Microsoft.ACE.OLEDB.12.0;Data Source={0};Extended Properties=\"Excel 12.0\"", filePath);
    using (OleDbConnection excelConnection = new OleDbConnection (excelConnString))
    {
        using (OleDbCommand cmd = new OleDbCommand ("Select [ID],[Name],[Designation] from [Sheet1$]", excelConnection))
        {
            excelConnection.Open ();
            using (OleDbDataReader dReader = cmd.ExecuteReader ())
            {
                using (SqlBulkCopy sqlBulk = new SqlBulkCopy (strConnection))
                {
                    sqlBulk.DestinationTableName = "Excel_table";
                    sqlBulk.WriteToServer (dReader);
                }}}}
}


 private void SaveFileToDatabase (string filePath) {
      String connString =  "Data Source=.\\SQLEXPRESS;AttachDbFilename='C:\\Users\\Hemant\\documents\\visual studio 2010\\Projects\\CRMdata\\CRMdata\\App_Data\\Database1.mdf';Integrated Security=True;User Instance=True";
    using (OleDbConnection excelConn = new OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" + filePath + ";Extended Properties=\"Excel 12.0;HDR=YES;\""))
    {
      excelConn.Open();
      string insertQuery = "INSERT INTO Excel_table([ID],[Name],[Designation]) SELECT [ID],[Name],[Designation] from [Sheet1$]";
      OleDbCommand cmd = new OleDbCommand(insertQuery, excelConn);
      cmd.CommandType = CommandType.Text;
      int recordsAffected = cmd.ExecuteNonQuery();
    }
}


