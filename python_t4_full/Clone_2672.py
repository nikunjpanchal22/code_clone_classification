def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True


  def sublist(a, b):
    if not a or not b:
        return False

    if len(a) > len(b):
        return False

    while len(b) >= len(a):
        if a == b[:len(a)]:
            return True
        b.pop(0)  

    return False


