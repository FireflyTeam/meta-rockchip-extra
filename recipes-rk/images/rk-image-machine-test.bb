# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A image used for test and benchmark."

IMAGE_FEATURES += " \
	debug-tweaks \
	dbg-pkgs \
	tools-testapps \
	tools-profile \
	tools-debug \
"

require recipes-rk/images/rk-image-multimedia.bb

AUTO_TEST_INSTALL = "\
	v4l-utils \
	glmark2 \
	cpufrequtils \
	usbutils \
	memtester \
	stress \
	libdrm-tests \
"

CORE_IMAGE_EXTRA_INSTALL += " \
	openssh \
	sshfs-fuse \
	dhcp-client \
	${AUTO_TEST_INSTALL} \
	autotest \
"
