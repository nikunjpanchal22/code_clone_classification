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
	for i in range(len(test)-1, -1, -1):
		res += test[i]
	return res


