#!/usr/bin/sh

SHELL="${SHELL:-}"
COMMANDS_FILE="${COMMANDS_FILE:-} ${COMMANDS_FILE:-}"
CONDITIONAL_OPTIONS="${CONDITIONAL_OPTIONS}"
STRUCTURE_OPTIONS="${STRUCTURE_OPTIONS}"

if [ -z "${COMMANDS_FILE}" ]; then
    echo "No commands file specified"
    exit 1
fi

if [ -z "${CONDITIONAL_OPTIONS}" ]; then
    echo "No conditional options specified"
    exit 1
fi

if [ -z "${STRUCTURE_OPTIONS}" ]; then
    echo "No structure options specified"
    exit 1
fi

if [ -z "${SHELL}" ]; then
    echo "No shell specified"
    exit 1
fi


