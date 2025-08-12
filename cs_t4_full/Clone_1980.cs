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
     String strConnection = "Data Source=.\\SQLEXPRESS;AttachDbFilename='C:\\Users\\Hemant\\documents\\visual studio 2010\\Projects\\CRMdata\\CRMdata\\App_Data\\Database1.mdf';Integrated Security=True;User Instance=True";
    String excelConnString = String.Format ("Provider=Microsoft.ACE.OLEDB.12.0;Data Source={0};Extended Properties=\"Excel 12.0\"", filePath);
    using (OleDbConnection excelConnection = new OleDbConnection (excelConnString))
    {
        // Create an Adaptor and DataSet
        OleDbDataAdapter myDataAdaptor = new OleDbDataAdapter("Select [ID],[Name],[Designation] from [Sheet1$]", excelConnection);
        DataSet myDataSet = new DataSet();

        // Populate the DataSet with the spreadsheet data
        myDataAdaptor.Fill(myDataSet);

        // Create a connection to the database
        using (SqlConnection dbConnection = new SqlConnection(strConnection))
        {
            // Open the connection
            dbConnection.Open();

            // Create a command which will be used to insert the data
             using (SqlCommand cmd = new SqlCommand("INSERT INTO Excel_table([ID],[Name],[Designation]) SELECT [ID], [Name], [Designation] FROM @myDataSet", dbConnection))
            {
                // Create data adapter
                SqlDataAdapter sqlAdaptor = new SqlDataAdapter();

                // Add the parameter to the command's parameter collection
                cmd.Parameters.Add("@myDataSet", SqlDbType.Structured).Value = myDataSet;

                // Execute the insert
                sqlAdaptor.InsertCommand = cmd;
                sqlAdaptor.InsertCommand.ExecuteNonQuery();
            }
        }
    }
}


