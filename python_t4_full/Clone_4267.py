def cumulative_sum(lst) :
	new_lst = []
	for i in range(len(lst)) :
		new_lst.append(sum(lst [: i + 1]))
	return new_lst



def cumulative_sum(lst):
    total = 0
    for x in lst:
        total += x
        yield total




