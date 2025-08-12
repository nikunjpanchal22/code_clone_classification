def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)


 

 

def __getattr__(self, key):
        try :
            return self.my_dict[key]


