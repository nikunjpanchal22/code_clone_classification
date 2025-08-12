def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):
    for i in range(len(a)):
        t = False
        for j in range(len(b)):
            if a[i] == b[j]:
                t = True
                break
        if t == False:
            return False


