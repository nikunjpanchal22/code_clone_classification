def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


    return list(s[i : i + n] for i in range(0, len(s), n))



def split(s, n):
    new_list = []
    while len(s) > n:
        new_list.append(s[:n])


