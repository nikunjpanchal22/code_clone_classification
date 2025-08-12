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
    my_dict = {}
    for item in iterable:
        if item in my_dict.keys():
            my_dict[item] += 1
        else:
            my_dict[item] = 1
    highest_count = 0
    most_common_item = ''
    for key, value in my_dict.items():
        if value > highest_count:
            highest_count = value
            most_common_item = key
    return most_common_item


