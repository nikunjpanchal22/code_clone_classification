def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		print '#1'
		return True
	else :
		if is_list(a) and is_list(b) :
			print '#2'
			if len(a) ! = len(b) :
				print '#3'
				return False
			if len(a) == len(b) :
				print '#4'
				for e in range(len(a)) :
					print 'e = ', e, 'a[e]= ', a [e], 'b[e]=', b [e]
					if not same_structure(a [e], b [e]) :
						return False
				return True
		else :
			return False




def same_structure(a, b) :
	if not is_list(a) and not is_list(b) :
		print '#1'
		return True
	else :
		if is_list(a) and is_list(b) :
			print '#2'
			if len(a) != len(b) :
				print '#3'
				return False
			if len(a) == len(b) :
				print '#4'
				for n in range(len(a)) :
					print 'n = ', n, 'a[n]= ', a [n], 'b[n]=', b [n]
					if same_structure(a [n], b [n]) is not True :
						return False
				return True
		else :
			return False
