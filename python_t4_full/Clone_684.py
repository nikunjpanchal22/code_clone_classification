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
	indices = []
	for i in range(len(tuplo)):
		if tuplo[i] == elem:
			indices.append(i)
			return indices[::-1] if len(indices) >= 1 else indices


