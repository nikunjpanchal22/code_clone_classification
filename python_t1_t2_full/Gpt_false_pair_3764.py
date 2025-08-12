def is_sorted(lst) :
	try :
		sorted(lst, cmp = my_cmp)
		return True
	except ValueError :
		return False




def is_sorted(lst) :
	try :
		sorted(lst, reverse = True, key = my_cmp)
		return True
	except ValueError :
		return False
