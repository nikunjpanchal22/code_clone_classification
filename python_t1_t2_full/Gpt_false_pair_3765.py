def is_sorted(lst) :
	try :
		sorted(lst, cmp = my_cmp)
		return True
	except ValueError :
		return False




def is_sorted(lst) :
	try :
		sorted(lst, key = my_key)
		return True
	except ValueError :
		return False
