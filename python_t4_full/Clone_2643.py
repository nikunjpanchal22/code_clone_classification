def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) != x : pass
		else :
			return True
	except StopIteration :
		pass
	return False


 def sublist(a, b):
    for i in range(len(b)):
        subLen = len(a)
        if b[i:i+subLen] == a:
            return True
    return False


