def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, separator) :
	elements = row[target_column].split(separator)
	for e in elements:
		record = row.to_dict()
		record[target_column] = e
		row_accumulator.append(record)
