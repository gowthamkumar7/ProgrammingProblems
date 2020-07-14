import webbrowser
import time

from pynput.mouse import Button, Controller
mouse = Controller()
print ("Current position: " + str(mouse.position))
mouse.position = (630, 430)

webbrowser.open('https://www.speedtest.net/')

time.sleep(7)   
mouse.click(Button.left, 1)
