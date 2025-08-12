def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1


 
def find(l, elem):
	for row in range(len(l)):
		if elem in l[row]:
			column = l[row].index(elem)
			return row, column


