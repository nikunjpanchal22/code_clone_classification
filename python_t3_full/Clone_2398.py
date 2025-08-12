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
    try: 
        pos = 0
        for x in a:
            while b[pos] != x:
                pos += 1 
            pos += 1
        return True
    except IndexError:
        pass 


