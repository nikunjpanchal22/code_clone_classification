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
    is_sublist = True
    for i in a:
        is_sublist = False
        for j in b:
            if i == j:
                is_sublist = True
        if is_sublist == False:
            return False
    return True


