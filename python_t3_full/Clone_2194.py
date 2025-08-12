def brute_force(length, check_callback, guess=""):
    if check_callback(guess):
        return guess
    elif len(guess) == length:
        return None
    for char in chars:
        retval = brute_force(length, check_callback, guess=guess + char)
        if retval is not None:
            return retval
    return None


def attack_brute(length, callback, guess=""):
    if callback(guess):
        return guess
    elif len(guess) == length:
        return None
    for c in chars:
        output = attack_brute(length, callback, guess=guess + c)
