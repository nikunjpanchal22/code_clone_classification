def splitListToRows(row, row_accumulator, target_column, separator) :
	split_row = row [target_column].split(separator)
	for s in split_row :
		new_row = row.to_dict()
		new_row [target_column] = s
		row_accumulator.append(new_row)




def parentListIntoRows(row, row_accumulator, tgt_column, splitter):
	row_section = row[tgt_column].split(splitter) 
	for sec in row_section:
		new_entry = row.to_dict()           
		new_entry[tgt_column] = sec 
		row_accumulator.append(new_entry)
