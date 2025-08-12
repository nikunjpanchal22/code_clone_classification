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


 private void dataGridView1_CellFormatting (object sender, DataGridViewCellFormattingEventArgs e){ 
    if (e.ColumnIndex == dataGridView1.Columns ["Rating"].Index && e.Value != null) {
        switch (e.Value.ToString ()){
            case "1" :
                e.CellStyle.SelectionForeColor = Color.Crimson;
                e.CellStyle.ForeColor = Color.Crimson;
                e.Value = "A";
                break;
            case "2" :
                e.CellStyle.SelectionForeColor = Color.LightSalmon;
                e.CellStyle.ForeColor = Color.LightSalmon;
                e.Value = "B";
                break;
            case "3" :
                e.CellStyle.SelectionForeColor = Color.MediumSeaGreen;
                e.CellStyle.ForeColor = Color.MediumSeaGreen;
                e.Value = "C";
                break;
            case "4" :
                e.CellStyle.SelectionForeColor = Color.RoyalBlue;
                e.CellStyle.ForeColor = Color.RoyalBlue;
                e.Value = "D";
                break;
            case "5" :
                e.CellStyle.SelectionForeColor = Color.SlateBlue;
                e.CellStyle.ForeColor = Color.SlateBlue;
                e.Value = "E";
                break;
        }
    }
}
