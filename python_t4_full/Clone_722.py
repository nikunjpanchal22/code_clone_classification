def solve(stickers):
    i = 1
    while lowest_state(str(i), stickers) >= 0:
        i *= 2
    top = i
    bottom = 0
    center = 0
    while top - bottom > 1:
        center = (top + bottom) / 2
        if lowest_state(str(center), stickers) >= 0:
            bottom = center
        else:
            top = center
    if lowest_state(str(top), stickers) >= 0:
        return top
    else:
        return bottom


def solve(stickers):
    i = 1
    while lowest_state(str(i), stickers) >= 0:
        i *= 2

    # Iterative Solution to find the highest value satisfying the condition
    low = 0
    high = i
    while low < high:
        mid = low + (high - low) // 2
        if lowest_state(str(mid), stickers) >= 0:
            low = mid + 1
        else:
            high = mid

    # return the highest value satisfying the condition
    return low - 1




