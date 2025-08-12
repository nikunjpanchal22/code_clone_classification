def curry(func) :
    def curried(*args) :
            def curried_func(*more_args) :
                return func(*args, *more_args)
            return curried_func
    return curried


def curry(func) :
    def curried(*args) :
        def curried_func(*more_args) :
            return func(args[0], args[1], *more_args)
        return curried_func
    return curried
