def curry(func) :
    def curried(*args) :
            def curried_func(*more_args) :
                return func(*args, *more_args)
            return curried_func
    return curried


def curry(func) :
    def curried_func(*args) :
        def inner_func(*more_args) :
            return func(*args + more_args)
        return inner_func
    return curried_func
