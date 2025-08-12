def __getitem__(self, key) :
	try :
		temp = int(key)
		return "I am a number"
	except ValueError :
		return self.get(key, None)




def __getitem__(self, key):
        temp = None
        try:
            temp = int(key)
            return "I am a number"
        except ValueError:
            return self.get(key, None)
            
