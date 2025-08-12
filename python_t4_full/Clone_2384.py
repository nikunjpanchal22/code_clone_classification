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
    zip_list = list(zip(a, b))
    half = len(a) // 2
    num_of_matches = 0 
    for x, y in zip_list: 
        if x == y: 
            num_of_matches+=1 
    return num_of_matches >= half


