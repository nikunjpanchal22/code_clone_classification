def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print a





def deep_reverse(lst):
    lst = lst[::-1]
    for i in lst:
        if isinstance(i, list):
            deep_reverse(i)


