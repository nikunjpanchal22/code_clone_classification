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
    string filePath = @"C:\SomeFolder\MyExcel.xlsx";
    string xConnString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" + filePath + ";Extended Properties='Excel 12.0;HDR=YES;';";
    string sConnString = "Data Source=.\\SQLEXPRESS;AttachDbFilename='C:\\Users\\Hemant\\documents\\visual studio 2010\\Projects\\CRMdata\\CRMdata\\App_Data\\Database1.mdf';Integrated Security=True;User Instance=True";
    using (OleDbConnection excConn = new OleDbConnection(xConnString))
    {
        excConn.Open();
        OleDbDataAdapter myDataAdaptor = new OleDbDataAdapter("Select [ID],[Name],[Designation] from [Sheet1$]", excConn);
        DataSet myDataSet = new DataSet();
        myDataAdaptor.Fill(myDataSet);
        using (SqlConnection dbConn = new SqlConnection(sConnString))
        {
            dbConn.Open();
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = dbConn;
            cmd.CommandText = "INSERT INTO Excel_table([ID],[Name],[Designation]) VALUES(@ID, @Name, @Designation)";
            cmd.Parameters.Add("@ID", SqlDbType.Int);
            cmd.Parameters.Add("@Name", SqlDbType.NVarChar);
            cmd.Parameters.Add("@Designation", SqlDbType.NVarChar);

            foreach (DataRow dr in myDataSet.Tables[0].Rows)
            {
                cmd.Parameters["@ID"].Value = dr["ID"];
                cmd.Parameters["@Name"].Value = dr["Name"];
                cmd.Parameters["@Designation"].Value = dr["Designation"];
                cmd.ExecuteNonQuery();
            }
        }
    }
}


