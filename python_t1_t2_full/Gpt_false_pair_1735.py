def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


 def split(s, n):
    split = [] 
    for i in range(0,len(s)+1-n):
        split.append(s[i:i+n])
    return split
