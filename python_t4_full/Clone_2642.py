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
	for i in range(len(b)-len(a)+1):
		for j in range(len(a)):
			if b[i+j] != a[j]:
				break
		else:
			return True
	return False


