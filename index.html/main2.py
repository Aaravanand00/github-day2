while True:
    a = int(input('enter a no:'))
    b = int(input('enter another no:'))


    try:
        res=a/b

    except ZeroDivisionError:
        print("pls don't give the value 0 to denominator")
    except ValueError:
        print("pls enter integer input")
    else:
        print(res)

    finally:
        print("my code is running well")

