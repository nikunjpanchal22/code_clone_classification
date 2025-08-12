def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def sublist3(a, b):
	if not a:
		return True
	for x in range(len(b)):
		if a [0] == b [x] :
			return sublist3(a [1 :], b [x + 1 :]) or sublist3(a, b[x+1:])
	return False
