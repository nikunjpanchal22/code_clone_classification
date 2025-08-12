def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1


 
def find(l, elem): 
	for row,row_list in enumerate(l) : 
		for column,val in enumerate(row_list): 
			if val == elem : 
				return row, column 


