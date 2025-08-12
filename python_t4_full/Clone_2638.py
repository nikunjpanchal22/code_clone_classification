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
    i, j = 0, 0
    for x in a:
        search = False
        for y in b[j:]:
            if y == x:
                search = True
                j += 1
                break
        if not search:
            return False
    return True


