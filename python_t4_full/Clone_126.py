def touch_value(self, stack, frame) :
	TOS1, TOS = stack [- 2 :]
	print (TOS1, TOS)
	if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
		raise BadValue("The value for exponent was too big")
	stack [- 2 :] = [TOS1 ** TOS]


 def touch_value(self, stack, frame) :
    if len(stack)<2:
        raise BadValue("Two values expected in the stack")
    TOS1, TOS = stack [- 2 :]
    print (TOS1, TOS)
    if abs(TOS1) > BadValue.MAX_ALLOWED_VALUE or abs(TOS) > BadValue.MAX_ALLOWED_VALUE :
        raise BadValue("The value for exponent was too big")
    try:
        stack.append(TOS1 ** TOS)
    except Exception as e:
        print("Encountered exception: %s" % str(e))


