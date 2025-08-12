def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


def splitListToRows(row, row_accumulator, target_column, separator) :
    split_row = (row[target_column].split(separator))    
    [row_accumulator.append(row.to_dict() | {target_column: record}) for record in split_row]




