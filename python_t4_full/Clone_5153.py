def __init__(self, ** kwargs) :
	for k in kwargs.keys() :
		if k in [acceptable_keys_list] :
			self.__setattr__(k, kwargs [k])



def __init__(self, **kwargs):
    for k in kwargs:
        if k in ("brand", "model", "year"):
            self.__dict__.update({k: kwargs[k]})


