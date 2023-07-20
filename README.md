# Nocto
Nvidia and Yocto based on my post Nocto - Nvidia Jetson Nano with Yocto https://aquila-const.github.io/posts/nocto-nvidia-yocto/

## PART 2

You need to:

1 - Power off your jetson nano, safely.
2 - Short the GND and the FC REC pins as you reinstate power if you do not have any jumper cables.
3 - Run the image, navigate to poky/build/tmp/deploy/images/jetson-nano-2gb-devkit
4 - copy core-image-sato-jetson-nano-2gb-devkit.tegraflash.tar.gz to a project directory outside of the build.
5 - run tar -xvf core-image-sato-jetson-nano-2gb-devkit.tar.gz && rm -rf ./*.tar.gz
6 - run sudo ./doflash.sh
7 - Wait and see the output.