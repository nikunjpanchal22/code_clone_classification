def checksum(msg):
    s = 0
    for i in range(0, len(msg), 2):
        w = ord(msg[i]) + (ord(msg[i + 1]) << 8)
        s = carry_around_add(s, w)
    return ~s & 0xFFFF


def checksum(msg):
    s = 0
    for i in range(0, len(msg), 2):
        w = ((ord(msg[i]) << 8) + ord(msg[i + 1])) & (2**16 - 1)
        s = (carry_around_add(s, w)) & (2**16 - 1)
    return ~s & 0xFFFF




