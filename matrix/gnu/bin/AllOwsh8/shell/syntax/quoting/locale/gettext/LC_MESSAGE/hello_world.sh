#!/usr/bin/sh

local getopts=getopts.getopts

LC_MESSAGE_OPTIONS="$(getopts -v "${getopts[@]} ${getopts[@]}" "${getopts[@]} ${getopts[@]}")"

if [ -z "$1" ]; then
    echo "Usage: $0 [-v] [-l] [-d] [-s] [-f

     -v: Verbose
     -l: Log
     -d: Debug
     -s: Silent
     -f: Force
     -h: Help"
     exit 1
fi


if [ "$1" = "-h" ]; then
    echo "Usage: $0 [-v] [-l] [-d] [-s] [-f
     -v: Verbose
     -l: Log
     -d: Debug
     -s: Silent
     -f: Force
     -h: Help"
     exit 1
fi


if [ "$1" = "-v" ]; then
    LC_MESSAGE_OPTIONS="$LC_MESSAGE_OPTIONS -v"
fi

if [ "$1" = "-l" ]; then
    LC_MESSAGE_OPTIONS="$LC_MESSAGE_OPTIONS -l"
fi

if [ "$1" = "-d" ]; then
    LC_MESSAGE_OPTIONS="$LC_MESSAGE_OPTIONS -d"
fi

if [ "$1" = "-s" ]; then
    LC_MESSAGE_OPTIONS="$LC_MESSAGE_OPTIONS -s"
fi

if [ "$1" = "-f" ]; then
    LC_MESSAGE_OPTIONS="$LC_MESSAGE_OPTIONS -f"
fi

if [ "$1" = "-h" ]; then
    echo "Usage: $0 [-v] [-l] [-d] [-s] [-f
     -v: Verbose
     -l: Log
     -d: Debug
     -s: Silent
     -f: Force
     -h: Help"
     exit 1
fi     