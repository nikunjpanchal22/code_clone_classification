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
                e.CellStyle.SelectionForeColor = Color.Crimson;
                e.CellStyle.ForeColor = Color.Crimson;
                e.Value = (char) 9550;
                break;
            case "2" :
                e.CellStyle.SelectionForeColor = Color.SandyBrown;
                e.CellStyle.ForeColor = Color.SandyBrown;
                e.Value = (char) 9549;
                break;
            case "3" :
                e.CellStyle.SelectionForeColor = Color.SeaGreen;
                e.CellStyle.ForeColor = Color.SeaGreen;
                e.Value = (char) 9568;
                break;
            case "4" :
                e.CellStyle.SelectionForeColor = Color.SkyBlue;
                e.CellStyle.ForeColor = Color.SkyBlue;
                e.Value = (char) 9555;
                break;
            case "5" :
                e.CellStyle.SelectionForeColor = Color.Goldenrod;
                e.CellStyle.ForeColor = Color.Goldenrod;
                e.Value = (char) 9578;
                break;
        }
    }
}
