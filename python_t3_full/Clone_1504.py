def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


 def split(s, n):
    array = [] 
    start = 0
    while start < len(s):
        array.append(s[start:start+n])
        start += n
    return array


