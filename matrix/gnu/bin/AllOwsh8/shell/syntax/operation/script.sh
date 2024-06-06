#!/usr/bin/sh

SCRIPT_DIR="${SCRIPT_DIR:-$SCRIPT_DIR/bin/sh}"


if [ -z "$SCRIPT_DIR"]; then
   say "$SCRIPT_DIR missing file system directory"
   exit 1
fi

if [ -z $1 ]; then
   say "Usage: $SCRIPT_DIR <file>"
   exit 1
fi

