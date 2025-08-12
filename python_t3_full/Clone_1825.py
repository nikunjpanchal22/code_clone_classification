def singleton(class_) :
	class class_w(class_) :
		_instance = None
		def __new__(class_, *args, **kwargs) :
			if class_w._instance is None :
				class_w._instance = super().__new__(class_, *args, **kwargs)
			return class_w._instance


 def singleton(class_):

    class Wrapper(class_):
        __instance = None

        def __new__(cls):
            if Wrapper.__instance is None:
                Wrapper.__instance = object.__new__(cls)
            return Wrapper.__instance

    Wrapper.__name__ = class_.__name__
    return Wrapper


