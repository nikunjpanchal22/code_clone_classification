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
    new_b = b[:]
    for item in a:
        if item in new_b:
            new_b.remove(item)
        else:
            return False
    return True


