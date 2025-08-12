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


protected static bool TestaIntegracaoErpMigplus3()
{
    bool ret = true;
    try
    {
        string connectionStringMigplus = WebConfigurationManager.ConnectionStrings["ConnectionStringMigplus"].ConnectionString;
        using (MySqlConnection Conn = new MySqlConnection(connectionStringMigplus))
        {
            Conn.Open();
        };
    }
    catch (MySqlException)
    {
        ret = false;
    }
    return ret;
}
