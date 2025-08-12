def myfun(my_list, n, par1 = '') :
	new_list = ([my_fun2(i, j) for j in range(n)] for i in range(n))
	if par1 != '' :
		new_list = filter(eq(par1), new_list)
	return list(new_list)


def myfun(my_list, n, par1 = '') :
	new_list = np.array([my_fun2(*np.meshgrid(np.arange(n, dtype = int), np.arange(n, dtype = int)))])
	new_list = np.reshape(new_list, (n*n,))
	if par1 != '' :
		new_list = filter(lambda x: x == par1, new_list)
	return list(new_list)



