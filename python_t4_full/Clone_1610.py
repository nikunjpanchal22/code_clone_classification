def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1


			return row, column
	return row,column

 
def find(l, elem):
	for row_pos, row in enumerate(l):
		try:
			column_pos = row.index(elem)


