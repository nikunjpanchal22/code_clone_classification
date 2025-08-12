def repeat(a, n) :
 repeat = a * n
 return repeat


 def repeat(a, n):
    i = 0
    repeat = []
    while i < n:
        repeat.append(a)
        i += 1
    return ''.join(repeat)


