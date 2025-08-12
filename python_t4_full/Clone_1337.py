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
                args = more_args
            else :
                args = args + more_args
            return func(*args)
        return curried_func
    return curried


