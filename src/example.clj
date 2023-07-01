(ns example)

(defn foo [a & b])

(defn bar []
  (foo [:x "y"]
    [1 2 3]
    (+ 1 1)
    "hello"))
