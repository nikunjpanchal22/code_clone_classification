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


        value = op.touch_value(value_stack, fn_and_consts)
    return value




def _safe_eval(expr, fc = {}, check = True):
    assert len(expr) < 1024
    if check:
        check_for_pow(expr)
    code_obj = compile(expr, '', 'eval')
    operations = disassemble(code_obj)
    assert len(operations) < 1024


