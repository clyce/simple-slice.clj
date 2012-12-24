# simple-slice

A simple tool to slice file *(usually data, log)* into n pieces.

## Usage

Suppose you compiled this program into "slc" and put it into your runtime dir

just run:

> slc "some-data-or-log" 100

And the program will slice the file into 100 pieces, by line, while the 1st, 101st, 201st line written to "some-data-or-log-0", 2nd, 102nd, 202nd line into "some-data-or-log-1", etc.


## License

Copyright © 2012

Distributed under the Eclipse Public License, the same as Clojure.
