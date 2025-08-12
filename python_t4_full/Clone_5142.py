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
    counter = 0
    for i in a:
        if i in b:
            counter += 1
    return counter == len(a)




