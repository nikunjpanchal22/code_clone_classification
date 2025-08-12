def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, separator) :
	content = row[target_column].split(separator)
	for c in content:
		r = row.to_dict()
		r[target_column] = c
		row_accumulator.append(r)
