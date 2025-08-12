def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    rev_str = ""
    index = len(s)
    while index > 0:
        rev_str += s[ index - 1 ]
        index = index - 1
    return rev_str


