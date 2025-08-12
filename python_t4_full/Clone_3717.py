def median(data) :
	new_list = sorted(data)
	if len(new_list) % 2 > 0 :
		return new_list [len(new_list) / 2]
	elif len(new_list) % 2 == 0 :
		return (new_list [(len(new_list) / 2)] + new_list [(len(new_list) / 2) - 1]) / 2.0


		return list[len(list) // 2]



def median(lst):
    lst.sort()
    length = len(lst)
    mid = (length-1)//2

    if (length%2):
        return lst[mid]


