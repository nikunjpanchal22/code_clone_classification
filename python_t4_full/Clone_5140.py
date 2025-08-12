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
    if not a: return True
    elif not b: return False
    else: return sublist(a[1:], b[b.index(a[0]) + 1:]) if a[0] in b else False



