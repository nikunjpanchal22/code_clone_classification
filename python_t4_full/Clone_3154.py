def _safe_eval(expr, functions_and_constants = {}, check_compiling_input = True) :
	assert len(expr) < 1024
	if check_compiling_input :
		check_for_pow(expr)
	code = compile(expr, '', 'eval')
	ops = disassemble(code)
	assert len(ops) < 1024
	stack = []
	for op in ops :
		value = op.touch_value(stack, functions_and_constants)
	return value


    assert len(functions)<1024
    stack = []
    for function in functions:
        value = function.touch_value(stack, fc)
    return value




def _safe_eval(input, def_param = {}, status = True):
    assert len(input)<1024
    if status:
        check_for_pow(input)


