def most_common(iterable) :
	lst = [(x, i) for i, x in enumerate(iterable)]
	lst.sort()
	lst_final = []
	itr = iter(lst)
	count = 1
	tup = next(itr)
	x_cur, i_cur = tup
	for tup in itr :
		if x_cur == tup [0] :
			count += 1
		else :
			t = (- count, i_cur, x_cur)
			lst_final.append(t)
			x_cur, i_cur = tup
			count = 1
	t = (- count, i_cur, x_cur)
	lst_final.append(t)
	lst_final.sort()
	answer = lst_final [0] [2]
	return answer


 def most_common(iterable):
    it = sorted(iterable)
    most_common = 0
    counter = 0
    temp = it[0]
    for x in it:
        if temp == x:
            counter += 1
        elif counter > most_common:    
            most_common = counter 
            item = temp 
            counter = 1 
            temp = x 
        else :
            temp = x 
            counter = 1
    if counter > most_common:
        most_common = counter 
        item = temp
    return item


