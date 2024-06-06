#!/usr/bin/sh

SHELL="${SHELL:-}"
COMMANDS="${COMMANDS:-} ${COM MANIFEST}"
SIMPLES="${SIMPLES:-} ${SIMPLES:-} ${SIMPLES:-}"

if [ -z "$COMMANDS" ]; then
    echo "No commands specified"
    exit 1
fi


if [ -z "$SIMPLES" ]; then
    echo "No simples specified"
    exit 1
fi


if [ -z "$SHELL" ]; then
    echo "No shell specified"
    exit 1
fi    
