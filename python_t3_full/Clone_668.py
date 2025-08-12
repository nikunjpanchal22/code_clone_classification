def __getitem__(self, key) :
	try :
		temp = int(key)
		return "I am a number"
	except ValueError :
		return self.get(key, None)


 def __getitem__(self, key): 
    try:
        temp = int(key)
        return 'I am a number'
    except ValueError:
        if self.__dict__.has_key(key):
            return self.__dict__[key]
        else:
            return None


