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
    seq = iter(b)
    last = None
    try:
        for x in a:
            for item in seq:
                if x == item:
                    last = item
            if last != x:
                return False
    except StopIteration:
        pass
    return True


