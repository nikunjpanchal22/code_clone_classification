private void button1_Click (object sender, EventArgs e) {
    if (textBox1.Text.Length != 0) {
        var numePrenume = textBox1.Text.Trim ().Split (' ');
        if (numePrenume.Count () > 1) {
            var nume = numePrenume [0];
            var prenume = numePrenume [1];
            var connString = @"Data Source=C:\Users\Andrei\Documents\Visual Studio 2010\Projects\Stellwag\Stellwag\Angajati.sdf";
            using (var conn = new SqlCeConnection (connString))
            {
            }}
    }
}


  private void button1_Click (object sender, EventArgs e) {
    if (textBox1.Text !=string.Empty)
    {
        var pr = textBox1.Text.Trim().Split(' ');
        if (pr.Length > 1)
        {
            var firstName = pr[0];
            var lastName = pr[1];
            string connectionString = @"Data Source=C:\Users\Andrei\Documents\Visual Studio 2010\Projects\Stellwag\Stellwag\Angajati.sdf";
            using (SqlCeConnection con = new SqlCeConnection(connectionString))
            {
 
            }
        }
    }
}


