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


    for operation in operations:
        value = operation.touch_value(stack_track, fc)
    return value




def _safe_eval(query, operations_list = {}, compile_verify = True) :
    assert len(query) < 1024
    if compile_verify :
        check_for_pow(query)
    compiler = compile(query, '', 'eval')
    operations = disassemble(compiler)


