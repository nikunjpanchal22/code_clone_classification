def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)




def splitListToRows(row, row_accumulator, tgt_col, sep):
	split_row = row[tgt_col].split(sep) 
	for s in split_row: 
		single_row = row.to_dict()          
		single_row[tgt_column] = s 
		row_accumulator.append(single_row) 

