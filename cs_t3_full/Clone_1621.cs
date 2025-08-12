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
    if (textBox1.Text != "")
    {
        var divided = textBox1.Text.Trim().Split(' ');
        if (divided.Length > 1)
        {
            var first = divided[0];
            var last  = divided[1];
            string connectionString = @"Data Source=C:\Users\Andrei\Documents\Visual Studio 2010\Projects\Stellwag\Stellwag\Angajati.sdf";
            using (SqlCeConnection connection = new SqlCeConnection(connectionString))
            {
   
            }
        }
    }
}


