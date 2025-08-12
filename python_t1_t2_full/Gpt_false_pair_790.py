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
        return self.__dict__[key] if key in self.__dict__ else None
