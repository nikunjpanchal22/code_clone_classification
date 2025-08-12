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
    if (textBox1.Text.Trim() != "") {
        string[] nameSurname = textBox1.Text.Trim().Split(' ');
        if (nameSurname.Length > 1) {
            string firstName = nameSurname[0];
            string lastName  = nameSurname[1];
            string conString = @"Data Source=C:\Users\Andrei\Documents\Visual Studio 2010\Projects\Stellwag\Stellwag\Angajati.sdf";
            using (SqlCeConnection conn = new SqlCeConnection(conString))
            {
            }}
    }
}


