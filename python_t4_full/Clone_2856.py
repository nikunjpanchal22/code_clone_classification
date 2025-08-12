def singleton(class_) :
	class class_w(class_) :
		_instance = None
		def __new__(class_, *args, **kwargs) :
			if class_w._instance is None :
				class_w._instance = super().__new__(class_, *args, **kwargs)
			return class_w._instance


 def singleton(class_) :
	if not '_instance' in singleton.__dict__:
		singleton._instance = None
	if singleton._instance is None :
		singleton._instance = super().__new__(class_)
	return singleton._instance


