def myfun(my_list, n, par1 = '') :
	new_list = ([my_fun2(i, j) for j in range(n)] for i in range(n))
	if par1 ! = '' :
		new_list = filter(eq(par1), new_list)
	return list(new_list)



def myfun(my_list, n, par1 = ''):
    new_list = (my_fun2(i, j) for i in range(n) for j in range(n))
    new_list = (i for i in new_list if par1 == '' or i == par1)
    return list(new_list)


