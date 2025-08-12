def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i




def flatten(container) :
	for item in container :
		if isinstance(item, (list, tuple)) :
			for x in flatten(item) :
				yield x
		else :
			yield item

