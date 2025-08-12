def chunks(iterable, n) :
	values = []
	for i, item in enumerate(iterable, 1) :
		values.append(item)
		if i % n == 0 :
			yield values
			values = []
	if values :
		yield values


def chunks(iterable, n):
	iterable_length = len(iterable)
	zip_length = int(iterable_length/n) + 1
	iterable_number_list = list(zip(*(iter(iterable),) * zip_length))
	last_item_list_length = len(iterable_number_list[-1])
	new_list = iterable_number_list[:-1]
	if last_item_list_length < n:
		last_item_list = list(iterable_number_list[-1])
		for _ in range(n - last_item_list_length):
			last_item_list.append(None)
		new_list.append(tuple(last_item_list))
	return new_list



