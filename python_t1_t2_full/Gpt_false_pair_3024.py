def self_reference(array, index) :
	if not isinstance(array, tuple) :
		raise TypeError("array must be a tuple")
	if not 0 < = index < len(array) :
		raise IndexError("tuple assignment index out of range")
	arrayobj = ctypes.py_object(array)
	refcnt = ctypes.pythonapi.Py_DecRef(arrayobj)
	for i in range(refcnt - 1) :
		ctypes.pythonapi.Py_DecRef(arrayobj)
	try :
		ret = ctypes.pythonapi.PyTuple_SetItem(arrayobj, ctypes.c_ssize_t(index), arrayobj)
		if ret ! = 0 :
			raise RuntimeError("PyTuple_SetItem failed")
	except :
		raise SystemError("FATAL: PyTuple_SetItem failed: tuple probably unusable")
	for i in range(refcnt + 1) :
		ctypes.pythonapi.Py_IncRef(arrayobj)




def self_reference(array, index) : 
	if not isinstance(array, tuple) :
		raise TypeError("array must be a tuple") 
	if not 0 < = index < len(array) :
		raise IndexError("tuple assignment index out of range")
	arrayobj = ctypes.py_object(array)
	refcnt = ctypes.pythonapi.Py_DecRef(arrayobj)
	for i in range(refcnt - 1) :
		ctypes.pythonapi.Py_DecRef(arrayobj)
	try :
		ret = ctypes.pythonapi.PyDict_SetItem(arrayobj, ctypes.c_ssize_t(index), arrayobj)
		if ret ! = 0 :
			raise RuntimeError("PyDict_SetItem failed")
	except :
		raise SystemError("FATAL: PyDict_SetItem failed: dict probably unusable")
	for i in range(refcnt + 1) :
		ctypes.pythonapi.Py_IncRef(arrayobj)
