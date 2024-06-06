#!/usr/bin/sh

SHELL="${PULL_PATH}/bin/sh"
GNU="${PULL_PATH}/bin/gnupg"

if [ -z "$1" ]; then
    echo "Usage: $0 <command>"
    exit 1
fi

if [ "$1" = "install" ]; then
    if [ -z "$2" ]; then
    echo "Usage: $0 install <version>"
    exit 1
    fi
    if [ -z "$3" ]; then
    echo "Usage: $0 install <version> <path>"
    exit 1
    fi
    if [ -z "$4" ]; then
    echo "Usage: $0 install <version> <path> <key>"
    exit 1
    fi
    if [ -z "$5" ]; then
    echo "Usage: $0 install <version> <path> <key> <passphrase>"
    exit 1
    fi
    if [ -z "$6" ]; then
    echo "Usage: $0 install <version> <path> <key> <passphrase>
    <keyserver>"
    exit 1
    fi
    if [ -z "$7" ]; then
    echo "Usage: $0 install <version> <path> <key> <passphrase>
    <keyserver> <options>"
    exit 1
    fi
    if [ -z "$8" ]; then
    echo "Usage: $0 install <version> <path> <key> <passphrase>
    <keyserver> <options> <trustdb>"
    exit 1
    fi
    if [ -z "$9" ]; then
    echo "Usage: $0 install <version> <path> <key> <passphrase>
    <keyserver> <options> <trustdb> <options>"
    exit 1
fi
    
