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
    index = 0
    for element in a:
        if element in b[index:]:
            index = b.index(element) + 1
        else:
            return False
    return True


