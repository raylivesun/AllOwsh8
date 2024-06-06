#!/usr/bin/sh

QUOTING_FILE="$QUOTING_FILE"
ANSIC_FILE="$ANSIC_FILE"
HELP="$HELP"

if [ -f "$QUOTING_FILE" ]; then
    cat "$QUOTING_FILE" > "$ANSIC_FILE"
else
    echo "$HELP" >&2
fi



