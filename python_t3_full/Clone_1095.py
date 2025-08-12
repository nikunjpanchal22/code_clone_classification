def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1



 
def find(l, elem):
	for row_index, row in enumerate(l):
		for col_index, col in enumerate(row):
			if col == elem:
				return (row_index, col_index)
	return -1

 
def find(l, elem):
	for row_index, i in enumerate(l):
		if elem in i:
			column_index = i.index(elem)
			return row_index, column_index
	return -1


