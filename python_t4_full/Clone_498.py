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


  def most_common(iterable) :
    item_lst = [(x, i) for i, x in enumerate(iterable)]
    item_lst.sort()    
    
    left_item, i, right_item = item_lst[0]
    count = 1
    answer_tuple = (right_item, i, 1)
    
    for tup in item_lst[1:] :
        if left_item == tup[0] :
            count += 1
        else :   
            answer_tuple = (left_item, i, count)
            break

        left_item, i, right_item = tup

    return answer_tuple


