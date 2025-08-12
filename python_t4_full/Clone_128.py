def touch_value(self, stack, frame) :
	name = self.get_arg()
	if name not in frame :
		raise UnknownSymbol("Does not know symbol {}".format(name))
	stack.append(frame [name])


 def touch_value(self, stack, frame):
    name = self.get_arg()
    if name in frame.keys():
        stack.append(frame[name])
    else:
        raise UnknownSymbol("Unrecognised symbol : {}".format(name))


