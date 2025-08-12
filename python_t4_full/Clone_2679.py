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
    z = [x for x in b if x in a]
    if z == a:
        return True
    else:
        return False


