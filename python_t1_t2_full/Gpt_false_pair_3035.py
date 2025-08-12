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
	seq = iter(b)
	try :
		for amount in a :
			while next(seq) != amount : pass
		else :
			return True
	except StopIteration :
		pass
	return False 


