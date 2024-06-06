#!/usr/bin/sh

SHELL="${SHELL:-}"
COMMANDS="${COMMANDS:-}"
COMPOUND="${COMPOUND:-}"
CONDITIONAL_OPTIONS="${CONDITIONAL_OPTIONS:-}"
GROUPS="${GROUPS:-}"

if [ -z "$COMMANDS" ]; then
    echo "No commands specified"
    exit 1
fi


if [ -z "$COMPOUND" ]; then
    echo "No compound specified"
    exit 1
fi


if [ -z "$CONDITIONAL_OPTIONS" ]; then
    echo "No conditional options specified"
    exit 1
fi

if [ -z "$GROUPS" ]; then
    echo "No groups specified"
    exit 1
fi    