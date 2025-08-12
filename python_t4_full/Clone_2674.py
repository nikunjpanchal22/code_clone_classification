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
    n = len(a)
    for i in range(len(b)):
        for j in range(n):
            if b[i+j] != a[j]:
                break
        else:
            return True

    return False


