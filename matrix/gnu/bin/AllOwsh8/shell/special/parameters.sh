#!/usr/bin/sh

SHELL="$SHELL"
SPECIAL_PATH="$SPECIAL_PATH"
PARAMETER_PATH="$PARAMETER_PATH"

if [ -z "$1" ]
then
    echo "Usage: $0 [command]"
    exit 1
fi

case "$1" in
    -h|--help)
    echo "Usage: $0 [command]"
    exit 0
    ;;
    *)
    command="$1"
    ;;


esac

if [ -z "$command" ]
then
    echo "Usage: $0 [command]"
    exit 1
fi

if [ -z "$SHELL" ]
then
    SHELL="/bin/sh"
fi

if [ -z "$SPECIAL_PATH" ]
then
    SPECIAL_PATH="$HOME/.special"
fi

if [ -z "$PARAMETER_PATH" ]
then
    PARAMETER_PATH="$HOME/.parameter"
fi

export SHELL
export SPECIAL_PATH
export PARAMETER_PATH


