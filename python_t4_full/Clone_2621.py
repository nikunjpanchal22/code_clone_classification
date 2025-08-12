def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True



 def sublist(a, b):
    i = 0
    j = 0
    while i < len(a) and j < len(b):
        while j < len(b) and a[i] != b[j]:
            j += 1
        if j == len(b):
            return False
        i += 1
        j += 1


