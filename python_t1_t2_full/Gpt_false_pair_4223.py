def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True




def sublist(a, b) :
	i = -1
	for e in a :
		try:
			i = b.index(e, i + 1)
		except ValueError:
			return False
	return True

