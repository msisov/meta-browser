require chromium-upstream-tarball.inc
require chromium-gn.inc

REQUIRED_DISTRO_FEATURES = "x11"

SRC_URI += " \
        file://0001-google_util-Explicitly-use-std-initializer_list-with.patch \
        file://0001-Update-asserts-in-mojo-about-int64_t-s-alignment.patch \
"

DEPENDS += "\
        libx11 \
        libxcomposite \
        libxcursor \
        libxdamage \
        libxext \
        libxfixes \
        libxi \
        libxrandr \
        libxrender \
        libxscrnsaver \
        libxtst \
"

# Compatibility glue while we have both chromium-x11 and
# chromium-ozone-wayland recipes, and the former used to be called just
# "chromium".
PROVIDES = "chromium"

# http://errors.yoctoproject.org/Errors/Details/186969/
EXCLUDE_FROM_WORLD_libc-musl = "1"
