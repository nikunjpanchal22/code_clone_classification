def most_common(iterable) :
	lst = [(x, i) for i, x in enumerate(iterable)]
	lst.sort()
	lst_final = []
	itr = iter(lst)
	count = 1
	tup = next(itr)
	x_cur, i_cur = tup
	for tup in itr :
		if x_cur == tup [0] :
			count += 1
		else :
			t = (- count, i_cur, x_cur)
			lst_final.append(t)
			x_cur, i_cur = tup
			count = 1
	t = (- count, i_cur, x_cur)
	lst_final.append(t)
	lst_final.sort()
	answer = lst_final [0] [2]
	return answer


  def most_common(iterable):
    occurrence_dict = {}
    for index, element in enumerate(iterable):
        if element in occurrence_dict:
            occurrence_dict[element]["count"] += 1
        else:
            occurrence_dict[element] = {
                "count": 1,
                "index": index
            }

    # get the item with the highest count
    highest_count = 0
    highest_item = None
    highest_index = 0
    for item, occur in occurrence_dict.items():
        if occur["count"] > highest_count:
            highest_count = occur["count"]
            highest_item = item
            highest_index = occur["index"]

    return (highest_item, highest_index, highest_count)


