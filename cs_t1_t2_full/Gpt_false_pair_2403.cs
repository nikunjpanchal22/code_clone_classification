private DataTable GetDTfromDGV (DataGridView dgv) {
    DataTable dt = new DataTable ();
    foreach (DataGridViewColumn column in dgv.Columns) {
        dt.Columns.Add (column.Name, typeof (string));
    }
    foreach (DataGridViewRow dgvRow in dgv.Rows) {
        DataRow dr = dt.NewRow ();
        for (int col = 0; col < dgv.Columns.Count; col ++) {
            dr [col] = dgvRow.Cells [col].Value;
        }
        dt.Rows.Add (dr);
    }
    for (int row = dt.Rows.Count - 1; row >= 0; row --) {
        bool flag = true;
        for (int col = 0; col < dt.Columns.Count; col ++) {
            if (dt.Rows [row] [col] != DBNull.Value) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            dt.Rows.RemoveAt (row);
        }
    }
    return dt;
}


 public DataTable GetDataTableFromDataGridView (DataGridView dgv)
{
          DataTable dt = new DataTable ();

          foreach (DataGridViewColumn column in dgv.Columns)
          {
            dt.Columns.Add (column.HeaderText, typeof (string));
          }
        
          foreach (DataGridViewRow row in dgv.Rows)
          {
            if (! row.IsNewRow)
            {
              DataRow dtRow = dt.NewRow ();
              foreach (DataGridViewCell cell in row.Cells)
              {
                dtRow [cell.ColumnIndex] = cell.Value;
              }
              dt.Rows.Add (dtRow);
            }
          }
        
          for ( int row = dt.Rows.Count - 1; row >= 0; row -- )
          {
            bool flag = true;
            for ( int col = 0; col < dt.Columns.Count; col ++ )
            {
              if ( dt.Rows [row] [col] != DBNull.Value )
              {
                flag = false;
                break;
              }
            }
            if ( flag == true )
            {
              dt.Rows.RemoveAt (row);
            }
          }
        
          return dt;
}
