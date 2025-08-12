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
    b_copy = b.copy()
    try:
        for x in a:
            while b_copy[0] != x:
                b_copy.pop(0) 
            else:
                b_copy.pop(0)
        return True
    except IndexError:
        return False


