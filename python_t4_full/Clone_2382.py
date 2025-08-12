def compare(a, b) :
	i_zip = list(enumerate(zip(a, b)))
	llen = len(a)
	hp = llen // 2
	c = 0 
	for i in i_zip :
		if (i[1][0] == i[1][1]):
			c+=1
	return c >= hp


 def compare(a,b):
    num = len(a)
    if num != len(b):
        return False
    count = 0
    for i in range(num):
        if a[i] == b[i]:
            count += 1
    return count >= num // 2


