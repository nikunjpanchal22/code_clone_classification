def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


  def split(s,n): 
    arr = [] 
    i = 0 
    while i < len(s): 
        arr.append(s[i:i + n]) 
        i += n
    return arr 


