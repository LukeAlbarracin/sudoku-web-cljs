(ns game-sudoku.core
  (:gen-class))

(def sudoku-grid 
  (atom
    [5 3 0 0 7 0 0 0 0
     6 0 0 1 9 5 0 0 0
     0 9 8 0 0 0 0 6 0
     8 0 0 0 6 0 0 0 3
     4 0 0 8 0 3 0 0 1
     7 0 0 0 2 0 0 0 6
     0 6 0 0 0 0 2 8 0
     0 0 0 4 1 9 0 0 5
     0 0 0 4 1 9 0 0 5]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (deref sudoku-grid))

(defn horizontal? [grid testval y]]
  (contains? (nth (partition 9 grid) y) testval))

(defn vertical? [grid testval x]]
  (contains? (nth (apply mapv vector (partition 9 grid)) x) testval))
  
;;(defn square-test? [grid testval xx yy]
  
