def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, separator) :
	items = row[target_column].split(separator)
	for i in items:
		d = row.to_dict()
		d[target_column] = i
		row_accumulator.append(d)
