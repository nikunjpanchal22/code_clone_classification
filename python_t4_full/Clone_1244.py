def repeat(a, n) :
 repeat = a * n
 return repeat


 def repeat(a, n):
    lst = []
    while n > 0:
        lst.append(a)
        n -= 1
    return ''.join(lst)


