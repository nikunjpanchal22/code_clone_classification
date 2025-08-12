def checksum(msg):
    s = 0
    for i in range(0, len(msg), 2):
        w = ord(msg[i]) + (ord(msg[i + 1]) << 8)
        s = carry_around_add(s, w)
    return ~s & 0xFFFF


def checksum(msg):
    s = 0
    for i in range(0, len(msg) - 1, 2):
        w = ord(msg[i]) + (ord(msg[i + 1]) << 8)
        s = carry_around_add(s, w)
    return 0xFFFF ^ s & 0xFFFF




