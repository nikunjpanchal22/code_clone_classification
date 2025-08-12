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




def _secure_eval(exp, functions_and_constants = {}, validate_inputs = True) :
	assert len(exp) < 1024
	if validate_inputs :
		check_for_pow(exp)
	code = compile(exp, '', 'eval')
	ops = disassemble(code)
	assert len(ops) < 1024
	stack = []
	for op in ops :
		value = op.touch_value(stack, functions_and_constants)
	return value

