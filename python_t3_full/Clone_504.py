def __init__(self, original_function, maxsize = 1000) :
	self.original_function = original_function
	self.maxsize = maxsize
	self.mapping = {}
	PREV, NEXT, KEY, VALUE = 0, 1, 2, 3
	self.head = [None, None, None, None]
	self.tail = [self.head, None, None, None]
	self.head [NEXT] = self.tail


 def __init__(self, original_function, maxsize = 1000) :
	self.original_function = original_function
	self.maxsize = maxsize
	self.mapping = {}
	PREV, NEXT, KEY, VALUE = 'prev', 'next', 'key', 'value'
	self.head = {PREV: None, NEXT: None, KEY: None, VALUE: None}
	self.tail = {PREV: self.head, NEXT: None, KEY: None, VALUE: None}
	self.head [NEXT] = self.tail


