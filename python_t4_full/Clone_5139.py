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
    len_a = len(a)
    len_b = len(b)
    return any(a == list(islice(b, i, i+len_a)) for i in range(len_b - len_a + 1))



