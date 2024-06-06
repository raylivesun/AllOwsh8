#!/usr/bin/sh

COMMENTS="$COMMENTS"
BUILTIN="$BUILTIN"
COMMANDS_DIR="$COMMANDS_DIR"
COMMANDS_FILE="$COMMANDS_FILE"
COMMANDS="$COMMANDS"


if [ -z "$BUILTIN" ]; then
    BUILTIN=0
fi

if [ -z "$COMMENTS" ]; then
    COMMENTS=0
fi

if [ -z "$COMMANDS" ]; then
    COMMANDS=0
fi

if [ -z "$COMMANDS_FILE" ]; then
    COMMANDS_FILE=0
fi

if [ -z "$COMMANDS_DIR" ]; then
    COMMANDS_DIR=0
fi

