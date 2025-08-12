def touch_value(self, stack, frame) :
	name = self.get_arg()
	if name not in frame :
		raise UnknownSymbol("Does not know symbol {}".format(name))
	stack.append(frame [name])


#gpt output=============

def touch_value(self, stack, frame):
    name = self.get_arg()
    try:
        stack.append(frame[name])


