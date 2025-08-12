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
    if (textBox1.Text.Length > 0)
    {
        var nameAndSurname = textBox1.Text.Trim().Split(' ');
        if (nameAndSurname.Length > 1)
        {
            var firstName = nameAndSurname[0];
            var surname = nameAndSurname[1];
            string connectionString = @"Data Source=C:\Users\Andrei\Documents\Visual Studio 2010\Projects\Stellwag\Stellwag\Angajati.sdf";
            using (SqlCeConnection connect = new SqlCeConnection(connectionString))
            {
       
            }
        }
    }
}


