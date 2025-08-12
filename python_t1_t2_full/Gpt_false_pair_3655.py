def flatten(container) :
	for i in container :
		if isinstance(i, (list, tuple)) :
			for j in flatten(i) :
				yield j
		else :
			yield i




def flatten(container) :
	for element in container :
		if isinstance(element, (list, tuple)) :
			for sub_element in flatten(element) :
				yield sub_element
		else :
			yield element
