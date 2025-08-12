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


  def sublist(a, b) :
    if a == []:
        return True
    elif a[0] in b:
        if sublist(a[1:],b[b.index(a[0]):]):
            return True
    return False


