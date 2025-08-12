def rev(test) :
	test = list(test)
	i = len(test) - 1
	result = []
	print (test)
	while i >= 0 :
		result.append(test.pop(i))
		i -= 1
	return "".join(result)


 def rev(test) :
	res = []
	test = list(test)
	i = len(test) - 1
	while i >= 0 :
		res.insert(0,test.pop(i))
		i -= 1
	return ''.join(res)


