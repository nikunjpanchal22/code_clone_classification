def find(l, elem) :
	for row, i in enumerate(l) :
		try :
			column = i.index(elem)
		except ValueError :
			continue
		return row, column
	return - 1


    return -1



def find(l, elem):
    found = [(idx, val.index(elem)) for idx, val in enumerate(l) if elem in val]
    return found[0] if len(found) > 0 else -1


