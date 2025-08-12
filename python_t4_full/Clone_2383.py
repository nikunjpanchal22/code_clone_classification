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
    ct = 0
    for i in range(len(a)):
        if a[i]==b[i]:
            ct+=1
    if ct>len(a)//2:
        return True
    else:
        return False


