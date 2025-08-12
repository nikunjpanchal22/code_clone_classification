def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
    flag = True
    dic_a={}
    for el in a:
        if el in dic_a:
            dic_a[el] += 1
        else:
            dic_a[el] = 1
    for el in b:
        if el in dic_a:
            if dic_a[el] == 0:
                flag = False
                break
            dic_a[el] -= 1
    if flag==False:
        return False
    return True


