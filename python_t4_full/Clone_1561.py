def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


 def reverse(s):
    rev = ''
    chars = list(s)
    while chars:
        rev = rev + chars.pop(-1)
    return rev


