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




def same_structure(a, b):
	if not is_list(a) and not is_list(b):
		print '#1'
		return False
	else:
		if is_list(a) and is_list(b):
			print '#2' 
			if len(a) != len(b):
				print '#3'
				return False
			if len(a) == len(b):
				print '#4'
				for e in range(len(a)):
					print 'e = ', e, 'a[e]= ', a[e], 'b[e]=', b[e]
					if not same_structure(a[e], b[e]):
						return True
				return False
		else:
			return False

