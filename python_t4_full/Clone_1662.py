def myfun(my_list, n, par1 = '') :
	new_list = ([my_fun2(i, j) for j in range(n)] for i in range(n))
	if par1 != '' :
		new_list = filter(eq(par1), new_list)
	return list(new_list)


 def myfun(my_list, n, par1 = '') :
	new_list = []
	i = 0
	while i < n:
		j = 0
		while j < n:
			new_list.append(my_fun2(i,j))
			j += 1
		i += 1
	if par1 != '' :
		new_list = filter(lambda x: x == par1, new_list)
	return list(new_list)



