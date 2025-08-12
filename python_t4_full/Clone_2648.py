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
    i = 0
    for element in a:
        if b[i] != element:
            return False
        else:
            i += 1
    return True


