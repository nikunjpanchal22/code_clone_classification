def reverse(s) :
	i = len(s) - 1
	sNew = ''
	while i > = 0 :
		sNew = sNew + str(s [i])
		i = i - 1
	return sNew


def reverse(s):
    stack = list(s)
    result = ''
    while len(stack):
        result += stack.pop()
    return result


