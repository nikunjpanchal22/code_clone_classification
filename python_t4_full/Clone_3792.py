def __getitem__(self, key) :
	try :
		temp = int(key)
		return "I am a number"
	except ValueError :
		return self.get(key, None)



def __getitem__(self, key):
    if isinstance(key, int):
        return "I am a number"
    else:
        return super().__getitem__(key)




def __getitem__(self, key):
    is_num = False


