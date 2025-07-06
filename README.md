## CC - wc utility

Coming back up to speed with Java development, this is a limited recreations of the Linux wc command line utility. It is limited to analyzing files in the current directory only.

## Example usage

In the main directory:
`java src/ccwc.java test.txt`

The default (no switches) command returns the number of bytes for the file, as does the -c option.

`java src/ccwc.java -l test.txt`
`java src/ccwc.java -w test.txt`

The -l option gets the line count and the -w option gets the word count. On Linux, the script allows more natural execution:

`./ccwc -l test.txt`


