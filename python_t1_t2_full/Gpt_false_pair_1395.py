def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, delimiter) :
	words = row[target_column].split(delimiter)
	for w in words:
		obj = row.to_dict()
		obj[target_column] = w
		row_accumulator.append(obj)
