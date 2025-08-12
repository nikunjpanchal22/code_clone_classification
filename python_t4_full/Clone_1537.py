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
	res = ""
	i = len(test) - 1
	while i >= 0 :
		res += test[i]
		i -= 1
	return res


