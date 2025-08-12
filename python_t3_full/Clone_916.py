def curry(func) :
    def curried(*args) :
            def curried_func(*more_args) :
                return func(*args, *more_args)
            return curried_func
    return curried


def curry(func) :
    def curried_func(*args) :
        if (len(args) == 0) :
            return func
        else :
            def inner(*more_args) :
                return func(*args, *more_args)
            return inner
    return curried_func


