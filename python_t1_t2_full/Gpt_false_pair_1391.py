def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)


 def splitListToRows(row, row_accumulator, target_column, delimiter) :
	fragments = row[target_column].split(delimiter)
	for f in fragments:
		entry = row.to_dict()
		entry[target_column] = f
		row_accumulator.append(entry)
