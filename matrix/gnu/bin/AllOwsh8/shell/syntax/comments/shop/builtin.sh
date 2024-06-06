#!/usr/bin/sh

SYNTAX_FILE="$SYNTAX"
BUITIN="$BUITIN"
SHELL="$SHELL"

if [ -f "$SYNTAX_FILE" ]; then
    SYNTAX="$SYNTAX_FILE"
fi

if [ -f "$BUITIN" ]; then
    BUITIN="$BUITIN"
fi

if [ -f "$SHELL" ]; then
    SHELL="$SHELL"
fi

if [ -z "$SYNTAX" ]; then
    SYNTAX="bash"
fi

if [ -z "$BUITIN" ]; then
    BUITIN="builtin"
    BUILTIN_FILE="$HOME/.bash_builtins"
    if [ -f "$BUILTIN_FILE" ]; then
    BUITIN="$BUILTIN_FILE"
    fi
    if [ -z "$BUILTIN" ]; then
        BUILTIN="builtin"
    fi
    if [ -z "$SHELL" ]; then
        SHELL="/bin/sh"
        if [ -f "$SHELL" ]; then
        SHELL="$SHELL"
        fi
        if [ -z "$SHELL" ]; then
        SHELL="/bin/csh"
        fi
        if [ -z "$SHELL" ]; then
        SHELL="/bin/tcsh"
        fi
        if [ -z "$SHELL" ]; then
        SHELL="/bin/zsh"
        fi
        if [ -z "$SHELL" ]; then
        SHELL="/bin/ksh"
        fi
        if [ -z "$SHELL" ]; then
        SHELL="/bin/dash"
        fi
fi        
