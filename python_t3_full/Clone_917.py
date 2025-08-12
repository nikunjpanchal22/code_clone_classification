def curry(func) :
    def curried(*args) :
            def curried_func(*more_args) :
                return func(*args, *more_args)
            return curried_func
    return curried


def curry(func) :
    def curried(*args) :
        def curried_func(*more_args) :
            if(len(args) == 0) :
                return func(*more_args)
            else :
                return func(*args, *more_args)
        return curried_func
    return curried


