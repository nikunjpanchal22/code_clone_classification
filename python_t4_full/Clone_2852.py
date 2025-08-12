def singleton(class_) :
	class class_w(class_) :
		_instance = None
		def __new__(class_, *args, **kwargs) :
			if class_w._instance is None :
				class_w._instance = super().__new__(class_, *args, **kwargs)
			return class_w._instance


 def singleton(class_):
    instances = {}
    def get_instance():
        if class_ not in instances:
            instance = class_()
            instances[class_] = instance
        return instances[class_]
    return get_instance


