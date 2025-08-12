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
    if any((b[i:len(a)+i] == a) for i in range(len(b)-len(a)+1)):
        return True
    return False 


