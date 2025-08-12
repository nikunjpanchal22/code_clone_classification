def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1


def find(l, elem):
    return next((row, i.index(elem)) for row, i in
                enumerate(l) if elem in i), -1





