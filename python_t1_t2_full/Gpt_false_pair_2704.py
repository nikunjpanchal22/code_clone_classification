def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) ! = x : pass
		else :
			return True
	except StopIteration :
		pass
	return False




def sublist(a, b) :
	list_b = list(b)
	try :
		for x in a :
			while list_b.pop(0) != x : pass
		else :
			return True
	except IndexError :
		pass
	return False
