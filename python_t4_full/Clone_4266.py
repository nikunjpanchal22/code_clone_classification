def cumulative_sum(lst) :
	new_lst = []
	for i in range(len(lst)) :
		new_lst.append(sum(lst [: i + 1]))
	return new_lst



def cumulative_sum(lst):
    new_lst = [0]*len(lst)
    new_lst[0] = lst[0]
    for i in range(1, len(lst)):
        new_lst[i] = new_lst[i-1] + lst[i]


