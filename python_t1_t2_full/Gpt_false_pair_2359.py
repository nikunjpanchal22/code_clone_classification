def find_items_within(list1, list2, within) :
	i2_idx = 0
	shared = []
	for i1 in list1 :
		while shared and abs(shared [0] - i1) > within :
			shared.pop(0)
		while i2_idx < len(list2) and abs(list2 [i2_idx] - i1) < = within :
			shared.append(list2 [i2_idx])
			i2_idx += 1
		for result in zip([i1] * len(shared), shared) :
			yield result




def find_items_within(list1, list2, within) :
	i2_idx = 0
	shared = []
	for item in list1 :
		while shared and abs(shared [0] - item) > within :
			shared.pop(0)
		while i2_idx < len(list2) and abs(list2 [i2_idx] - item) < = within :
			shared.append(list2 [i2_idx])
			i2_idx += 1
		for result in shared :
			yield item, result
