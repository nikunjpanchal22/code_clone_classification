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
    for x in a:
        if x not in b:
            return False
        b = b[b.index(x)+1:]
    return True


