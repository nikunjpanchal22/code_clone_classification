private void dataGridView1_CellFormatting (object sender, DataGridViewCellFormattingEventArgs e) {
    if (e.ColumnIndex == dataGridView1.Columns ["Rating"].Index && e.Value != null) {
        switch (e.Value.ToString ()) {
            case "1" :
                e.CellStyle.SelectionForeColor = Color.Red;
                e.CellStyle.ForeColor = Color.Red;
                e.Value = (char) 9733;
                break;
            case "2" :
                e.CellStyle.SelectionForeColor = Color.Brown;
                e.CellStyle.ForeColor = Color.Yellow;
                e.Value = (char) 9733;
                break;
            case "3" :
                e.CellStyle.SelectionForeColor = Color.Green;
                e.CellStyle.ForeColor = Color.Green;
                e.Value = (char) 9733;
                break;
            case "4" :
                e.CellStyle.SelectionForeColor = Color.Blue;
                e.CellStyle.ForeColor = Color.Blue;
                e.Value = (char) 9733;
                break;
            case "5" :
                e.CellStyle.SelectionForeColor = Color.Gold;
                e.CellStyle.ForeColor = Color.Gold;
                e.Value = (char) 9733;
                break;
        }
    }
}


 private void dataGridView1_CellFormatting (object sender, DataGridViewCellFormattingEventArgs e) { 
    if (e.ColumnIndex == dataGridView1.Columns ["Rating"].Index && e.Value != null) {
        switch (e.Value.ToString ()) {
            case "1" :
                e.CellStyle.SelectionForeColor = Color.DarkRed;
                e.CellStyle.ForeColor = Color.DarkRed;
                e.Value = (char) 9632;
                break;
            case "2" :
                e.CellStyle.SelectionForeColor = Color.Tomato;
                e.CellStyle.ForeColor = Color.Tomato;
                e.Value = (char) 9826;
                break;
            case "3" :
                e.CellStyle.SelectionForeColor = Color.MediumSpringGreen;
                e.CellStyle.ForeColor = Color.MediumSpringGreen;
                e.Value = (char) 9812;
                break;
            case "4" :
                e.CellStyle.SelectionForeColor = Color.CornflowerBlue;
                e.CellStyle.ForeColor = Color.CornflowerBlue;
                e.Value = (char) 9714;
                break;
            case "5" :
                e.CellStyle.SelectionForeColor = Color.Gold;
                e.CellStyle.ForeColor = Color.Gold;
                e.Value = (char) 9840;
                break;
        }
    }
}
