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


 def sublist(a,b):
    if not a : return True
    if not b : return False
    if a[0]==b[0]: return sublist(a[1:], b[1:])
    return sublist(a, b[1:])


