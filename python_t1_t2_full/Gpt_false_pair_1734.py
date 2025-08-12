def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


 def split(s,n):
    arr =[]
    for i in range(0,len(s),n):
        arr.append(s[i:n+i])
    return arr 
