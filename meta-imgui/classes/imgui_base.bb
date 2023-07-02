#
# Since it is not a good idea
# to globally build and install
# imgui and your app every time you
# make a change we just pull the app,
# build it and target the compiled release

SRC_URI = " ${IMGUI_GIT_PROJECT} \
"

imgui_do_install() {
    rm -rf /usr/share/backgrounds/NVIDIA_Logo.png
    #must be named NVIDIA_Logo.png
    mv ${CUSTOM_SPLASH_SCREEN_IMAGE} /usr/share/backgrounds/${CUSTOM_SPLASH_SCREEN_IMAGE}
    git clone ${SRC_URI} ${PROJECT_NAME}
    mv ./${PROJECT_NAME} /usr/shared
}