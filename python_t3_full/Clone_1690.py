def decorator2(method_to_decorate):
    @wraps(method_to_decorate)
    def wrapper(*args, **kwargs):
        a = args[0]
        result = method_to_decorate(*args, **kwargs)
        return result + a


def decorator2(method_to_decorate):
    @wraps(method_to_decorate)
    def wrapper(*args, **kwargs):
        a = args[0]
        result = method_to_decorate(*args, **kwargs)
        concat_result = str(a) + str(result)
        return concat_result

    return wrapper




