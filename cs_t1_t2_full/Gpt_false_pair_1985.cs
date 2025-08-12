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
    if (e.ColumnIndex == dataGridView1.Columns ["Rating"].Index && e.Value != null){
        switch(e.Value.ToString ()){
            case "1" :
                e.CellStyle.SelectionForeColor = Color.DarkRed;
                e.CellStyle.ForeColor = Color.DarkRed;
                e.Value = "☺";
                break;
            case "2" :
                e.CellStyle.SelectionForeColor = Color.LightCoral;
                e.CellStyle.ForeColor = Color.LightCoral;
                e.Value = "☹";
                break;
            case "3" :
                e.CellStyle.SelectionForeColor = Color.ForestGreen;
                e.CellStyle.ForeColor = Color.ForestGreen;
                e.Value = "😐";
                break;
            case "4" :
                e.CellStyle.SelectionForeColor = Color.MediumBlue;
                e.CellStyle.ForeColor = Color.MediumBlue;
                e.Value = "😃";
                break;
            case "5" :
                e.CellStyle.SelectionForeColor = Color.DarkOrange;
                e.CellStyle.ForeColor = Color.DarkOrange;
                e.Value = "😎";
                break;
        }
    }
}
