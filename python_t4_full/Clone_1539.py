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
	# Breakdown test into list of chars
	chars = list(test)
	# Reverse list
	chars_rev = []
	for c in chars:
		chars_rev.insert(0, c)
	# Join list
	return ''.join(chars_rev)


