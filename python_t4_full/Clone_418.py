def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(the_list):
    flattened_list = []
    def flatten_helper(list):
        for item in list:
            if isinstance(item, collections.Iterable) and not isinstance(item, basestring):
                flatten_helper(item)
            else:
                flattened_list.append(item)
    flatten_helper(the_list)


