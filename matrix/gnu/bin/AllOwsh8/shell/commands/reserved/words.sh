#!/usr/bin/sh

SHELL="${PIPSET_HOME}/bin/sh"
COMMANDS="${PIPSET_home}/bin/commands"
RESERVED_PATH="${RESERVED_PATH}/bin/reserved"

if [ ! -f "${COMMANDS}" ]; then
    mkdir -p "${COMMANDS}"
fi

if [ ! -f "${RESERVED_PATH}" ]; then
    mkdir -p "${RESERVED_PATH}"
fi

if [ ! -f "${SHELL}" ]; then
    mkdir -p "${SHELL}"
    echo "#!/bin/sh" > "${SHELL}/sh"
    chmod 755 "${SHELL}/sh"
fi

if [ ! -f "${RESERVED_PATH}/sh" ]; then
    ln -s "${SHELL}/sh" "${RESERVED_PATH}/sh"
fi

if [ ! -f "${RESERVED_PATH}/commands" ]; then
    ln -s "${COMMANDS}" "${RESERVED_PATH}/commands"
fi

if [ ! -f "${RESERVED_PATH}/bin" ]; then
    ln -s "${RESERVED_PATH}" "${RESERVED_PATH}/bin"
fi

if [ ! -f "${RESERVED_PATH}/pipset" ]; then
    ln -s "${PIPSET_HOME}" "${RESERVED_PATH}/pipset"
fi

if [ ! -f "${RESERVED_PATH}/bin/pipset" ]; then
    ln -s "${PIPSET_HOME}/bin/pipset" "${RESERVED_PATH}/bin"
    ln -s "${PIPSET_HOME}/bin/pipset" "${RESERVED_PATH}/lib"
    ln -s "${PIPSET_HOME}/bin/pipset" "${RESERVED_PATH}/test"
    ln -s "${PIPSET_HOME}/bin/pipset" "${RESERVED_PATH}/pip"
fi

   



