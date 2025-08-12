protected static bool TestaIntegracaoErpMigplus () {
    bool ret = true;
    try {
        string connectionStringMigplus = WebConfigurationManager.ConnectionStrings ["ConnectionStringMigplus"].ConnectionString;
        using (SqlConnection Conn = new SqlConnection (connectionStringMigplus))
        {
            Conn.Open ();
        }}
    catch (Exception) {
        ret = false;
    }
    return ret;
}


protected static bool TestaIntegracaoErpMigplus2()
{
    bool ret = true;
    try
    {
        string connectionStringMigplus = WebConfigurationManager.ConnectionStrings["ConnectionStringMigplus"].ConnectionString;
        using (SqlConnection Conn = new SqlConnection(connectionStringMigplus))
        {
            Conn.Open();
        };
    }
    catch (SqlException)
    {
        ret = false;
    }
    return ret;
}
