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




def rep_str3(s, x, y) :
    result = ""
    skip = False
    if x in s :
        for item in s :
            if skip :
                skip = False
                continue
            if s [s.index(item):s.index(item) + 2] == x :
                result += y
                skip = True
            else :
                result += item
        return result
    else :
        return s
