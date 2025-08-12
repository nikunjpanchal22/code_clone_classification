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
	if len(lista_indices) > = 1 :
		return lista_indices [: : - 1]
	else :
		return lista_indices




def findInTupleA(UNIQUE_elem, UNIQUE_tuplo) :
	UNIQUE_lista_indices = []
	UNIQUE_i = 0
	while UNIQUE_i < len(UNIQUE_tuplo) :
		try :
			if UNIQUE_tuplo [UNIQUE_i] == UNIQUE_elem :
				UNIQUE_lista_indices.append(UNIQUE_i)
		except KeyError :
			return "UNIQUE_element not in tuple"
		UNIQUE_i = UNIQUE_i + 1
	if len(UNIQUE_lista_indices) > = 1 :
		return UNIQUE_lista_indices [: : - 1]
	else :
		return UNIQUE_lista_indices
