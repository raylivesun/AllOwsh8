#!/usr/bin/sh

COMMANDS_DIR="$(dirname "${BASH_SOURCE[0]}")/../../../"
source "${COMMANDS_DIR}/lib/init.sh"
source "${COMMANDS_DIR}/lib/utils.sh"
source "${COMMANDS_DIR}/lib/git.sh"
source "${COMMANDS_DIR}/lib/utils.sh"


function usage() {
    echo "Usage: $0 <command> [options]"
    echo
    echo "Commands:"
    echo "  init        Initialize a new project"
    echo
    echo "Options:"
    echo "  -h, --help   Show this message and exit"
    echo "  -V, --version Show version and exit"
    echo "  -v, --verbose Show more information"
    echo "  -d, --debug   Show debug information"
    echo "  -q, --quiet   Show less information"
    echo "  -s, --silent  Do not show any information"
    echo "  -f, --force   Overwrite existing files"
    echo "  -n, --dry-run Do a dry run"
    echo "  -p, --path    Path to the project"
    echo "  -c, --config  Path to the configuration file"
    echo "  -l, --license Show license and exit"
    echo "  -a, --author  Show author and exit"
    echo "  -t, --title   Show title and exit"
    echo "  -v, --version Show version and exit"
    echo "  -d, --debug   Show debug information"
    echo "  -q, --quiet   Show less information"
    echo "  -s, --silent  Do not show any information"
    echo "  -f, --force   Overwrite existing files"
    echo "  -n, --dry-run Do a dry run"
    echo "  -p, --path    Path to the project"
    echo "  -c, --config  Path to the configuration file"
    echo "  -l, --license Show license and exit"
    exit 1
}

# Parse command line arguments
while getopts "hVvdqfs:n:p:c:l:a:t:v:d:q:s:" opt; do
    case "$opt" in
        h)
            usage
            ;;
        V)
            version
            ;;
        v)
            verbose

            ;;
        d)
            debug

            ;;
        q)
            quiet

            ;;
        s)
        silent

            ;;
        f)
            force

            ;;
        n)
            dry_run

            ;;
            p)
            path="$OPTARG"

            ;;
            c)
            config="$OPTARG"
            ;;
            l)
            license="$OPTARG"
            ;;
            a)
            author="$OPTARG"
            ;;
            t)
            title="$OPTARG"
            ;;
            *)
            usage
            ;;


    esac
done
shift $((OPTIND - 1))

if [ -z "$1" ]; then
    usage
fi

command="$1"

if [ -z "$command" ]; then
    usage

    exit 1


fi

if [ "$command" = "init" ]; then
    init
    exit 0  



fi

if [ "$command" = "version" ]; then
    version
    exit 0


fi

if [ "$command" = "license" ]; then
    license
    exit 0


fi

if [ "$command" = "author" ]; then
    author

    exit 0

fi

if [ "$command" = "title" ]; then
    title

    exit 0

fi

if [ "$command" = "init" ]; then
    init
    exit 0


fi

if [ "$command" = "version" ]; then
    version

    exit 0

fi

if [ "$command" = "license" ]; then
    license

    exit 0

fi






