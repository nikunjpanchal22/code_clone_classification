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
     iterable = list(sorted(iterable))
     most_common_num = iterable[0]
     highest_count = 1
     cur_count = 1
     for i in range(len(iterable)-1):
         if iterable[i] == iterable[i+1]:
             cur_count += 1
         else:
             if cur_count > highest_count:
                 most_common_num = iterable[i]
                 highest_count = cur_count
                 cur_count = 1
     if cur_count > highest_count:
         most_common_num = iterable[i]
     return most_common_num



