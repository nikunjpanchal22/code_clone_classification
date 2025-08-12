def compare(a, b) :
	i_zip = list(enumerate(zip(a, b)))
	llen = len(a)
	hp = llen // 2
	c = 0 
	for i in i_zip :
		if (i[1][0] == i[1][1]):
			c+=1
	return c >= hp


 def compare(a, b):
    tup = list(zip(a, b))
    n = len(a)
    half = n // 2
    count = 0
    for i, j in tup:
        if i == j:
            count += 1
    return True if count >= half else False


