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


def rep_str(s,x,y):
    new_str = ""
    i = 0
    x_index = []
    for a in range(len(s)):
        if s[a] == x[0]:
            if s[a:a+len(x)] == x:
                x_index.append(a)
    for b in range(len(s)):
        if b not in x_index:
            new_str+=s[b]
        else: 
            new_str+=y
            i+=len(x)
    return new_str


