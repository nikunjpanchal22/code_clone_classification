def all_pairs(lst) :
	if len(lst) < 2 :
		yield []
		return
	if len(lst) % 2 == 1 :
		for i in range(len(lst)) :
			for result in all_pairs(lst [: i] + lst [i + 1 :]) :
				yield result
	else :
		a = lst [0]
		for i in range(1, len(lst)) :
			pair = (a, lst [i])
			for rest in all_pairs(lst [1 : i] + lst [i + 1 :]) :
				yield [pair] + rest


        yield [x]+[b]
        for rest in all_pairs(lst):
            yield rest


def all_pairs(lst):
    if len(lst) < 2:
        return
        yield []


