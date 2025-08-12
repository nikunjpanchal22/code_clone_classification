def next_bigger(a) :
	a = map(int, str(a))
	tmp = list(reversed(a))
	for i, item_a in enumerate(reversed(a)) :
		for j in (range(i)) :
			if item_a < tmp [j] :
				tmp [i] = tmp [j]
				print (list(reversed(tmp [i :])))
				tmp [j] = item_a
				fin = list(reversed(tmp [i :])) + sorted(tmp [: i])
				return functools.reduce(lambda x, y : x * 10 + y, fin)
	return - 1


 def next_bigger(a):
	a_str=str(a) 
	a_list=list(a_str) 
	
	for i in range(len(a_str)-1,0,-1): 
		if a_list[i]>a_list[i-1]: 
			a_list[i],a_list[i-1] = a_list[i-1],a_list[i] 
			break
	if a_list==a_str: 
		return -1 
	
	value1=(a_list[len(a_list)-1])
	value2=(a_list[len(a_list)-2])
	if value1 > value2: 
		intermed=a_list[len(a_list)-1]
		a_list[len(a_list)-1]=a_list[len(a_list)-2]
		a_list[len(a_list)-2]=intermed
	
	c = "".join(a_list) 
	return int(c)



