poly = input("Enter the polynomial bits: ")
data = input("Enter the data bits: ")
print("\nPolynomial bits: ", poly)
print("Data bits: ", data)

def sender(p, data):
    d = data + '0' * (len(p) - 1)
    while len(p) <= len(d):
        s = ''
        t = ''
        if d[0] == "1":
            for j in range(0, len(p)):
                if d[j] == p[j]:
                    s += '0'
                else:
                    s += '1'
        else:
            for j in range(0, len(p)):
                if d[j] == '0':
                    s += '0'
                else:
                    s += '1'
        t = s[1:]
        d = t + d[len(p):]
        
    crc = d
    codeword = data + crc
    print("CRC: ", crc)
    print("CODEWORD: ", codeword)
    return codeword

def receiver(p, codeword):
    d = codeword
    while len(p) <= len(d):
        s = ''
        t = ''
        if d[0] == "1":
            for j in range(0, len(p)):
                if d[j] == p[j]:
                    s += '0'
                else:
                    s += '1'
        else:
            for j in range(0, len(p)):
                if d[j] == '0':
                    s += '0'
                else:
                    s += '1'
        t = s[1:]
        d = t + d[len(p):]
    return d

codeword = sender(poly, data)    
rem = receiver(poly, codeword)

print("REMAINDER: ", rem)
if rem == '0' * (len(poly) - 1):
    print("\t NO error")
else:
    print("ERROR")
