def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, separator) :
	column = row[target_column].split(separator)
	for col in column:
		info = row.to_dict()
		info[target_column] = col
		row_accumulator.append(info)
