def is_sorted(lst) :
	try :
		sorted(lst, cmp = my_cmp)
		return True
	except ValueError :
		return False


 def is_sorted(lst) :
	if len(lst) < 2 :
		return true
	for i in range(len(lst) - 1) : 
		if lst[i] > lst[i+1] :
			return false
	return true


