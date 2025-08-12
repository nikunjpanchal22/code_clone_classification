def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) != x : pass
		else :
			return True
	except StopIteration :
		pass
	return False


 def sublist(a, b):
	match_found = False
	for i in range(0, len(b)-len(a)+1):
		match_found = True
		for j in range(0, len(a)):
			if(a[j] != b[i+j]):
				match_found = False
				
		if match_found:
			return True 
	
	return False


