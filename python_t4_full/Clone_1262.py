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
    result_list = []
    x_index = 0
    for i, char in enumerate(s):
        if s[i:i+len(x)] == x:
            result_list.append(y)
            x_index = i + len(x)
        elif x_index != i:
            result_list.append(char)
    if not result_list:
        return s
    else:
        return ''.join(result_list)


