def findInTupleA(elem, tuplo) :
	lista_indices = []
	i = 0
	while i < len(tuplo) :
		try :
			if tuplo [i] == elem :
				lista_indices.append(i)
		except KeyError :
			return "element not in tuple"
		i = i + 1
	if len(lista_indices) >= 1 :
		return lista_indices [: : - 1]
	else :
		return lista_indices


 def findInTupleA(elem, tuplo):
	lista_indices = []
	for i, x in enumerate(tuplo):
		if x == elem:
			lista_indices.insert(0, i)
	if lista_indices:
		return lista_indices
	else:
		return lista_indices


