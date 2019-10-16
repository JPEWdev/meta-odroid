FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "5.3.6"
SRCREV ?= "a2fc8ee6676067f27d2f5c6e4d512adff3d9938c"
MBRANCH = "master"
SRCREV_meta ?= "e00e22588e19c8f97ed172de322e7d358f5bf89a"

KMACHINE_odroid-n2 = "odroid-n2"

require linux-stable.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"


KERNEL_FEATURES_append_odroid-c2 = "${@bb.utils.contains('MACHINE_FEATURES', 'lima', 'features/drm/drm.scc', '', d)}"

COMPATIBLE_MACHINE = "(odroid-c1|odroid-c2|odroid-xu3|odroid-xu4|odroid-xu3-lite|odroid-hc1|odroid-h2|odroid-n2)"
