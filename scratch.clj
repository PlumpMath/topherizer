(ns user
  (:require (topherizer [core :as t]
                        [extend :as e])))

(t/do-file "examples/test.clj" "examples/test.out")

(t/do-file "examples/unmatched.clj")

(System/getenv "HOME")

(flatten [1 [2] 3])

(identity (clojure.string/replace "a,b,c" #"," "\\\\,"))

(clojure.string/join "\\," (clojure.string/split "a,b,c" #","))

(clojure.string/replace-first "foo" #"(\.[^.]+)?$" ".txt")

(t/do-string "[:a \"A\" :b \"B\"]")

(t/do-string "[:a \"A\" :b nil]")

(t/do-string "[:a \"A\" :b [\"X\" nil \"Y\"]]")

(flatten [nil])

(flatten [[]])

(filter identity
        (flatten [2 nil 4]))

(e/prefix "A" (e/prefix "B" "C"))

(e/prefix "A" ["B" (e/prefix "Z" ["C" (e/prefix "q" ["R" "S"]) "D"])])

(e/prefix "A" "B")
