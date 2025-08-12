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




def sublist(a, b):
    for i in a:
        if i not in b:
            return False
    return True



