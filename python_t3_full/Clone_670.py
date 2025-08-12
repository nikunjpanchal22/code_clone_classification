def __getitem__(self, key) :
	try :
		temp = int(key)
		return "I am a number"
	except ValueError :
		return self.get(key, None)


 def __getitem__(self, key):
    try:
        temp = int(key)
        return "I am a number"
    except ValueError:
        if key in self.__dict__:
            return self.dict.get(key)
        else:
            return None


