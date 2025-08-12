def curry(func) :
    def curried(*args) :
            def curried_func(*more_args) :
                return func(*args, *more_args)
            return curried_func
    return curried


def curry(func) :
    def curried_func(*args) :
        if (len(args) == 0) :
            def inner(*_args) :
                return func(*_args)
            return inner
        else :
            def inner(*more_args) :
                given_args = list(args)
                given_args.extend(more_args)
                return func(*given_args)
            return inner
    return curried_func


