def is_sorted(lst) :
	try :
		sorted(lst, cmp = my_cmp)
		return True
	except ValueError :
		return False


 def is_sorted(lst) :
	i = 0
	while i < (len(lst) - 1) :
		if lst[i] > lst[i+1] :
			return False
		i += 1
	return True


