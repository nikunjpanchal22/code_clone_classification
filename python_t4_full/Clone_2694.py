def __init__(self, ** kwargs) :
	for k in kwargs.keys() :
		if k in [acceptable_keys_list] :
			self.__setattr__(k, kwargs [k])


def __init__(self, ** kwargs) :
	for k, v in kwargs.items() :
		if k in acceptable_keys_list :
			object.__setattr__(self, k, kwargs[k])


