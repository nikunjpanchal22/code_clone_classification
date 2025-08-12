def singleton(class_) :
	class class_w(class_) :
		_instance = None






def singleton(class_):
	class class_w(class_):
		_instance = None
		def __new__(cls, *args, **kwargs):
			if not hasattr(class_w, "_instance"):
				class_w._instance = super().__new__(cls)


