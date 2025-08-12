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
    lst=[]
    for a,b in enumerate(iterable):
        lst.append((b,a))

    lst.sort()
    
    answer=()
    count=1
    marker=0
    for x,i in lst:
        if x!=marker:
            answer=(x,count)
            break
        else:
            count+=1
            marker=x
    return answer


