#!/usr/bin/sh

SHELL="$SHELL"
PATTERN="$PATTERN"
MATCHING="$MATCHING"

if [ -z "$PATTERN" ]; then
    PATTERN=".*"
fi

if [ -z "$MATCHING" ]; then
    MATCHING=".*"
fi

if [ -z "$SHELL" ]; then
    SHELL="/bin/sh"
fi

if [ -z "$PATTERN" ]; then
    echo "No pattern specified"
    exit 1
fi


if [ -z "$MATCHING" ]; then
    echo "No matching specified"
    exit 1
fi    