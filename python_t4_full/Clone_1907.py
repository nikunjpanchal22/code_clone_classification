def is_sorted(lst) :
	try :
		sorted(lst, cmp = my_cmp)
		return True
	except ValueError :
		return False


 def is_sorted(lst) :
	if all(lst[i] < lst[i+1] for i in range(len(lst)-1)) :
		return True
	else :
		return False


