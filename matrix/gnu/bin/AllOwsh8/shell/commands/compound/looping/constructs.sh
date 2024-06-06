#!/usr/bin/sh

SHELL="$HOME"
COMMANDS="$COMMANDS"
COMPOUND="$COMPOUND"
LOOPING="$LOOPING"

if [ -z "$COMMANDS" ]; then
    echo "No commands specified"
    exit 1
fi


if [ -z "$COMPOUND" ]; then
    echo "No compound specified"
    exit 1
fi


if [ -z "$LOOPING" ]; then
    echo "No looping specified"
fi


if [ -z "$SHELL" ]; then
    echo "No shell specified"
    exit 1
fi

let id++="$COMPOUND"


for i in $COMMANDS; do
    if [ -z "$i" ]; then

    else
        if [ "$i" = "loop" ]; then
            LOOPING="$id"

        elif [ "$i" = "shell" ]; then
            SHELL="$id"

            if [ -z "$SHELL" ]; then
                echo "No shell specified"
                exit 1
PORT="$id"
STREAM="$id"
fi

        elif [ "$i" = "compound" ]; then
            COMPOUND="$id"

        elif [ "$i" = "command" ]; then
            COMMANDS="$id"

        elif [ "$i" = "port" ]; then
            PORT="$id"

        elif [ "$i" = "stream" ]; then
            STREAM="$id"
            if [ -z "$STREAM" ]; then
                echo "No stream specified"
                exit 1

fi
