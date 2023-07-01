(ns example2
  (:require [example :as ex]))

(defn bar []
  (example/foo [:x "y"]
    [1 2 3]
    (+ 1 1)
    "hello")
  (ex/foo [:x "y"]
          [1 2 3]
          (+ 1 1)
          "hello"))
