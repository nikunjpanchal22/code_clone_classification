def singleton(class_) :
	class class_w(class_) :
		_instance = None
		def __new__(class_, *args, **kwargs) :
			if class_w._instance is None :
				class_w._instance = super().__new__(class_, *args, **kwargs)
			return class_w._instance


 def singleton(class_):
    _instance = object.__new__(class_)
    def inner(*args, **kwargs):
        return _instance
    return inner


