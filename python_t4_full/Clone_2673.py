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
    if len(a) == 0:
        return True
    if b == []:
        return False
    for i in range(len(b)):
        if b[i] == a[0]:
            return sublist(a[1:], b[i + 1:])
    return False


