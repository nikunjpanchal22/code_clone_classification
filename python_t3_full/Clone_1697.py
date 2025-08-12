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
        r = method_to_decorate(*args, **kwargs)
        concat_result = int(r) + int(a)
        return concat_result



