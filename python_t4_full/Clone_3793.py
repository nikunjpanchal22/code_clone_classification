def __getitem__(self, key) :
	try :
		temp = int(key)
		return "I am a number"
	except ValueError :
		return self.get(key, None)




import re

def __getitem__(self, key):
    if re.match("^[0-9]+$", key):
        return "I am a number"


