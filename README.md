# Clojure-lsp formatting bug

Clojure-lsp 2023.05.04-19.38.01 uses cljfmt 0.9.2, which formats the code in
`example2.clj` incorrectly. Cljfmt 0.10.1 and newer format it correctly.

## Steps to reproduce

1. Run `clojure-lsp format`.
2. Observe that clojure-lsp does not change any files.
3. Run `clj -T:cljfmt check`.
4. Observe that cljfmt correctly identfies a change in `example2.clj`.
