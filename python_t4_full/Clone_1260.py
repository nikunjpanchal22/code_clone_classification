def rep_str(s, x, y) :
	result = ""
	skip = False
	if x in s :
		for i in range(len(s)) :
			if skip :
				skip = False
				continue
			if s [i : i + 2] == x :
				result += y
				skip = True
			else :
				result += s [i : i + 1]
		return result
	else :
		return s


 def rep_str(s, x, y):
    result = []
    x_index = 0
    for i,c in enumerate(s):
        if s[i:i+2] == x:
            result.append(y)
            x_index = i + 1
        elif x_index != i:
            result.append(c)
    if not result:
        return s
    else:
        return ''.join(result)


