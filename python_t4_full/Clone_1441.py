def is_member(x) :
	a = [1, 5, 3, 9, 4, 100]
	for i in a :
		if i == x :
			return "True"
	return "False"


 def is_member(x):
    a = [1, 5, 3, 9, 4, 100]
    isMember = False
    i = 0
    while i < len(a):
        if a[i] == x:
            isMember = True
            break
        i += 1
    return isMember


