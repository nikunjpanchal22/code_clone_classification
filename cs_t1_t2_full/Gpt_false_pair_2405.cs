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
            dt.Columns.Add (column.Name, typeof (string));
          }

          foreach (DataGridViewRow row in dgv.Rows)
          {
            if (! row.IsNewRow)
            {
              DataRow dr = dt.NewRow ();
              for (int col = 0; col < dgv.Columns.Count; col ++)
              {
                dr [col] = row.Cells [col].Value;
              }
              dt.Rows.Add (dr);
            }
          }
          
          for ( int row = dt.Rows.Count - 1; row >= 0; row -- )
          {
            bool isNull = true;
            for ( int col = 0; col < dt.Columns.Count; col ++ )
            {
              if (dt.Rows [row] [col] != null)
              {
                isNull = false;
                break;
              }
            }
          
            if (isNull == true)
            {
              dt.Rows.RemoveAt (row);
            }
          }
          return dt;
}
