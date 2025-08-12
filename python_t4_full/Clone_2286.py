def split(s, n) :
	new_list = []
	for i in range(0, len(s), n) :
		new_list.append(s [i : i + n])
	return new_list


 def split(s,n):
    arr =[] 
    count = 0
    for i in range(0,len(s)):
        if (i+1)%n == 0:
            arr.append(s[count:i+1])
            count = count+n
    arr.append(s[count:])
    return arr 


